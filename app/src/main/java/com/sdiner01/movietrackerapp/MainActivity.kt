package com.sdiner01.movietrackerapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.MaterialAutoCompleteTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Status bar: pure black with light icons
        WindowCompat.setDecorFitsSystemWindows(window, true)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = false

        // Toolbar: use centered logo only, no title
        findViewById<MaterialToolbar>(R.id.topAppBar).title = ""

        val rvMovies = findViewById<RecyclerView>(R.id.rvMovies)
        val fabAdd = findViewById<FloatingActionButton>(R.id.fabAdd)
        val spnCategory = findViewById<MaterialAutoCompleteTextView>(R.id.spnCategory)

        val sampleMovies = listOf(
            Movie("Inception", "Science Fiction & Fantasy"),
            Movie("The Dark Knight", "Action & Adventure"),
            Movie("The Hangover", "Comedy"),
            Movie("Interstellar", "Science Fiction & Fantasy"),
            Movie("Parasite", "Thriller & Mystery")
        )

        val categories = listOf(
            "All",
            "Action & Adventure",
            "Comedy",
            "Drama",
            "Science Fiction & Fantasy",
            "Thriller & Mystery",
            "Other"
        )
        spnCategory.apply {
            setAdapter(ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, categories))
            setDropDownBackgroundResource(android.R.color.white)
            setText("All", false)
            setOnClickListener { showDropDown() }
        }

        rvMovies.layoutManager = LinearLayoutManager(this)
        rvMovies.adapter = MovieAdapter(sampleMovies) { movie ->
            startActivity(
                Intent(this, MovieDetailActivity::class.java).apply {
                    putExtra("title", movie.title)
                    putExtra("category", movie.category)
                }
            )
        }

        fabAdd.setOnClickListener {
            startActivity(Intent(this, AddMovieActivity::class.java))
        }
    }
}
