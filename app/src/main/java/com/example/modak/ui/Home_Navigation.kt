package com.example.modak.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.bumptech.glide.Glide
import com.example.modak.R
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_sample.*
import kotlinx.android.synthetic.main.appbar_layout.*
import kotlinx.android.synthetic.main.navigation_header.*
import kotlinx.android.synthetic.main.navigation_header.view.*

class Home_Navigation : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home__navigation)
        setSupportActionBar(toolbar)
//      val actionbar=supportActionBar
//        actionbar?.title= "Ahmedabad"
//        val drawerToggle :ActionBarDrawerToggle = object : ActionBarDrawerToggle( this,drawer_layout,toolbar,(R.string.open),(R.string.close))
//
//
//        drawerToggle.isDrawerIndicatorEnabled=true
//        drawer_layout.addDrawerListener(drawerToggle)
//        drawerToggle.syncState()
        //val image_view=findViewById<ImageView>(R.id.profile_image)
       /* Glide.with(this)
            .load(R.drawable.btn_fb)
            .into(profile_image)*/

        var drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        var navView = findViewById<NavigationView>(R.id.navigation_view)
        var headerview : View = navView.getHeaderView(0)

        var header_image : ImageView=headerview.findViewById(R.id.profile_image)
        var title_name : TextView=headerview.findViewById<TextView>(R.id.title_1)
            title_name.setText("My Orders")


        Glide .with(this) .load(R.mipmap.bg_myprofile) .into(header_image)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, 0, 0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar_menu,menu)
        return true
    }
}