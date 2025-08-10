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

        // Toolbar: set brand title + red color + back arrow
        findViewById<MaterialToolbar>(R.id.toolbarAdd).apply {
            title = getString(R.string.brand_title)
            setTitleTextColor(ContextCompat.getColor(this@AddMovieActivity, R.color.primary_color))
            setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }
            // Center title defensively (older libs may ignore)
            try { isTitleCentered = true } catch (_: Throwable) {}
        }

        // Category dropdown (so the field isn't empty)
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
