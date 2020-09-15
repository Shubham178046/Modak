package com.example.modak.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import com.bumptech.glide.Glide
import com.example.modak.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.navigation_header.*

class MainActivity : AppCompatActivity() {



    private val SPLASH_TIME_OUT:Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({

            startActivity(Intent(applicationContext,Login::class.java))
            finish()

        },SPLASH_TIME_OUT)
       // decorview.setSystemUiVisibility(visiblity)


        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

       window.decorView.apply {

           systemUiVisibility= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
       }



    }
}
