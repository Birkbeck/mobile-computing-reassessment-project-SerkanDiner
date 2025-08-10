package com.sdiner01.movietrackerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView

class MovieAdapter(
    private val movies: List<Movie>,
    private val onItemClick: ((Movie) -> Unit)? = null
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Root is a MaterialCardView in item_movie.xml
        val card: MaterialCardView = itemView as MaterialCardView
        val title: TextView = itemView.findViewById(R.id.tvTitle)
        val category: TextView = itemView.findViewById(R.id.tvCategory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.title.text = movie.title
        holder.category.text = movie.category

        if (onItemClick != null) {
            holder.card.isClickable = true
            holder.card.setOnClickListener {
                val pos = holder.bindingAdapterPosition
                if (pos != RecyclerView.NO_POSITION) {
                    onItemClick.invoke(movies[pos])
                }
            }
        } else {
            holder.card.isClickable = false
            holder.card.setOnClickListener(null)
        }
    }

    override fun getItemCount(): Int = movies.size
}
