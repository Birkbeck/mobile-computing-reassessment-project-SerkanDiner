package com.sdiner01.movietrackerapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        // Status bar: pure black with light icons
        WindowCompat.setDecorFitsSystemWindows(window, true)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = false

        // Views
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbarDetail)
        val tvTitle = findViewById<TextView>(R.id.tvMovieTitle)
        val tvCategory = findViewById<TextView>(R.id.tvMovieCategory)
        val btnDelete = findViewById<MaterialButton>(R.id.btnDelete)
        val btnEdit = findViewById<MaterialButton>(R.id.btnEdit)

        // Read data from intent
        val title = intent.getStringExtra("title") ?: "Unknown Title"
        val category = intent.getStringExtra("category") ?: "Unknown Category"

        // Toolbar: brand title in red (centered) + back arrow
        toolbar.apply {
            this.title = getString(R.string.brand_title)
            setTitleTextColor(ContextCompat.getColor(this@MovieDetailActivity, R.color.primary_color))
            setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }
            try { isTitleCentered = true } catch (_: Throwable) {}
        }

        // Bind movie info
        tvTitle.text = title
        tvCategory.text = "Category: $category"

        // CW1 preview actions
        btnDelete.setOnClickListener {
            Toast.makeText(this, "Delete tapped (CW2 will implement)", Toast.LENGTH_SHORT).show()
        }
        btnEdit.setOnClickListener {
            Toast.makeText(this, "Edit tapped (CW2 will implement)", Toast.LENGTH_SHORT).show()
        }
    }
}
