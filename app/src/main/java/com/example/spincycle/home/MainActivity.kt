package com.example.spincycle.home

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
import com.example.spincycle.favorite.FavoriteActivity
import com.example.spincycle.history.HistoryActivity
import com.example.spincycle.welcome.WelcomeActivity
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var fabService: FloatingActionButton
    private lateinit var fabExpress: FloatingActionButton
    private lateinit var fabNear: FloatingActionButton
    private lateinit var fabSelfService: FloatingActionButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fabService = findViewById(R.id.service)
        fabExpress = findViewById(R.id.express)
        fabNear = findViewById(R.id.near)
        fabSelfService = findViewById(R.id.self_service)

        val searchBar = findViewById<ImageButton>(R.id.search_bar)
        val progressBar = findViewById<ProgressBar>(R.id.loadingBar)

        val btnFav = findViewById<ImageButton>(R.id.btnFav)
        val btnHistory = findViewById<ImageButton>(R.id.btnHistory)
        val btnAcc = findViewById<ImageButton>(R.id.btnAcc)

        fabService.setOnClickListener {
            val intent = Intent(this, ServiceActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        fabExpress.setOnClickListener {
            val intent = Intent(this, ExpressActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        fabNear.setOnClickListener {
            val intent = Intent(this, NearActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        fabSelfService.setOnClickListener {
            val intent = Intent(this, SelfServiceActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }

        searchBar.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
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

        btnAcc.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            progressBar.visibility = View.GONE
        }
    }
}