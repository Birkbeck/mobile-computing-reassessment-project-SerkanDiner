package com.sdiner01.movietrackerapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the FAB by its ID in activity_main.xml
        val fabAdd = findViewById<FloatingActionButton>(R.id.fabAdd)

        // TEMP navigation for CW1 preview
        fabAdd.setOnClickListener {
            val intent = Intent(this, AddMovieActivity::class.java)
            startActivity(intent)
        }
    }
}
