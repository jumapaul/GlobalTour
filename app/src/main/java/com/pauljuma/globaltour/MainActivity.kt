package com.pauljuma.globaltour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: MaterialToolbar
    private lateinit var navController: NavController
    private lateinit var drawableLayout: DrawerLayout
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize views
        toolbar = findViewById(R.id.tbToolbar)
        navigationView = findViewById(R.id.nvView)
        drawableLayout = findViewById(R.id.drawerLayout)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.FragmentContainer) as NavHostFragment
        navController = navHostFragment.navController

        // Connect drawer layout with navigation component
        val appConfiguration = AppBarConfiguration(navController.graph, drawableLayout )

        // Connect toolbar with navcontroller
        toolbar.setupWithNavController(navController, appConfiguration)

        //Connecting navigation view with nav controller
        navigationView.setupWithNavController(navController)

    }

    override fun onBackPressed() {
        if (drawableLayout.isOpen){
            drawableLayout.close()
        }
        else{
            super.onBackPressed()
        }
    }
}