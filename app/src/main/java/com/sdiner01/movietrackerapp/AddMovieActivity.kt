package com.sdiner01.movietrackerapp

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.textfield.MaterialAutoCompleteTextView

class AddMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_movie)

        // Status bar: pure black with light icons
        WindowCompat.setDecorFitsSystemWindows(window, true)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = false

        // Toolbar: we use a centered logo; clear any title just in case. Back arrow works via XML.
        findViewById<MaterialToolbar>(R.id.toolbarAdd).apply {
            title = ""
            setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }
        }

        // Category dropdown (white panel for readability over black UI)
        val etCategory = findViewById<MaterialAutoCompleteTextView>(R.id.etCategory)
        val categories = listOf(
            "Action & Adventure",
            "Comedy",
            "Drama",
            "Science Fiction & Fantasy",
            "Thriller & Mystery",
            "Other"
        )
        etCategory.apply {
            setAdapter(ArrayAdapter(this@AddMovieActivity, android.R.layout.simple_list_item_1, categories))
            setDropDownBackgroundResource(android.R.color.white)
            setOnClickListener { showDropDown() }
        }
    }
}
