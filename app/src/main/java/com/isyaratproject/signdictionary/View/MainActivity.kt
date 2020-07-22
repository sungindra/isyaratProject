package com.isyaratproject.signdictionary.View

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import android.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.isyaratproject.signdictionary.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(appToolbar)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_dictionary,
            R.id.navigation_forum
        ))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        loginTxt.setOnClickListener {
            val loginIntent = Intent(this, Login:: class.java)
            startActivity(loginIntent)
            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show()
        }

        registerTxt.setOnClickListener {
            val registerIntent = Intent(this, CreateAccount:: class.java)
            startActivity(registerIntent)
            Toast.makeText(this, "Register", Toast.LENGTH_SHORT).show()
        }
    }
}