package com.example.spincycle.favorite

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.spincycle.R
import com.example.spincycle.account.ProfileActivity
import com.example.spincycle.history.HistoryActivity
import com.example.spincycle.home.MainActivity

class FavoriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_favorite)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val progressBar = findViewById<ProgressBar>(R.id.loadingBar)

        val btnHome = findViewById<ImageButton>(R.id.btnHome)
        val btnHistory = findViewById<ImageButton>(R.id.btnHistory)
        val btnAcc = findViewById<ImageButton>(R.id.btnAcc)

        btnHome.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        btnHistory.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        btnAcc.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }
    }
}