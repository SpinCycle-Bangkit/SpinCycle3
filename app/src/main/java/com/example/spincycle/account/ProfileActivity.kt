package com.example.spincycle.account

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
import com.example.spincycle.favorite.FavoriteActivity
import com.example.spincycle.history.HistoryActivity
import com.example.spincycle.home.MainActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val progressBar = findViewById<ProgressBar>(R.id.loadingBar)

        val btnHome = findViewById<ImageButton>(R.id.btnHome)
        val btnFav = findViewById<ImageButton>(R.id.btnFav)
        val btnHistory = findViewById<ImageButton>(R.id.btnHistory)

        btnHome.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        btnFav.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, FavoriteActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        btnHistory.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        val cvProfile = findViewById<View>(R.id.cvEdit)
        val cvAddress = findViewById<View>(R.id.cvAddress)
        val cvSettings = findViewById<View>(R.id.cvSettings)
        val cvHelp = findViewById<View>(R.id.cvHelp)

        cvProfile.setOnClickListener{
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        cvAddress.setOnClickListener{
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, AddressActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        cvSettings.setOnClickListener{
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        cvHelp.setOnClickListener{
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }
    }
}