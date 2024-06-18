package com.example.spincycle.account

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.spincycle.R
import com.example.spincycle.welcome.WelcomeActivity

class SettingActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_setting)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val progressBar = findViewById<ProgressBar>(R.id.loadingBar)
        val btnBack = findViewById<View>(R.id.btnBack)

        btnBack.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        val cardLogout = findViewById<View>(R.id.cardLogout)

        cardLogout.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }
    }
}