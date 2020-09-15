package com.example.modak.ui

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.modak.R

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var linear_layout1 : LinearLayout =findViewById(R.id.menu1_layout)
        var linear_layout2 : LinearLayout =findViewById(R.id.menu2_layout)
        var linear_layout3 : LinearLayout =findViewById(R.id.menu3_layout)
        var linear_layout4 : LinearLayout =findViewById(R.id.menu4_layout)

        var menu1_img : ImageView= findViewById(R.id.menu1_img)
        var menu2_img : ImageView= findViewById(R.id.menu2_img)
        var menu3_img : ImageView= findViewById(R.id.menu3_img)
        var menu4_img : ImageView= findViewById(R.id.menu4_img)

        var menu1_txt : TextView =findViewById(R.id.txt_favorite)
        var menu2_txt : TextView =findViewById(R.id.txt_delivery)
        var menu3_txt : TextView =findViewById(R.id.txt_takeout)
        var menu4_txt : TextView =findViewById(R.id.txt_dinein)

        linear_layout1.setOnClickListener {

            menu1_txt.setTypeface(null,Typeface.BOLD)
            menu1_img.setImageResource(R.mipmap.footer_icon4_selected)

//////        text
            menu2_txt.setTypeface(null,Typeface.NORMAL)
            menu3_txt.setTypeface(null,Typeface.NORMAL)
            menu4_txt.setTypeface(null,Typeface.NORMAL)

            ////image

            menu2_img.setImageResource(R.mipmap.footer_icon3_unselected)
            menu3_img.setImageResource(R.mipmap.footer_icon1_unselected)
            menu4_img.setImageResource(R.mipmap.footer_icon2_unselected)

        }
        linear_layout2.setOnClickListener {

            menu2_txt.setTypeface(null,Typeface.BOLD)
            menu2_img.setImageResource(R.mipmap.footer_icon3_selected)


            menu1_txt.setTypeface(null,Typeface.NORMAL)
            menu3_txt.setTypeface(null,Typeface.NORMAL)
            menu4_txt.setTypeface(null,Typeface.NORMAL)

            ////image
            ////image

            menu1_img.setImageResource(R.mipmap.footer_icon4_unselected)
            menu3_img.setImageResource(R.mipmap.footer_icon1_unselected)
            menu4_img.setImageResource(R.mipmap.footer_icon2_unselected)
        }
        linear_layout3.setOnClickListener {

            menu3_txt.setTypeface(null,Typeface.BOLD)

            menu3_img.setImageResource(R.mipmap.footer_icon1_selected)


            menu2_txt.setTypeface(null,Typeface.NORMAL)
            menu1_txt.setTypeface(null,Typeface.NORMAL)
            menu4_txt.setTypeface(null,Typeface.NORMAL)

            ////image


            menu2_img.setImageResource(R.mipmap.footer_icon3_unselected)
            menu1_img.setImageResource(R.mipmap.footer_icon4_unselected)
            menu4_img.setImageResource(R.mipmap.footer_icon2_unselected)
        }
        linear_layout4.setOnClickListener {

            menu4_txt.setTypeface(null,Typeface.BOLD)

            menu4_img.setImageResource(R.mipmap.footer_icon2_selected)

            menu2_txt.setTypeface(null,Typeface.NORMAL)
            menu3_txt.setTypeface(null,Typeface.NORMAL)
            menu1_txt.setTypeface(null,Typeface.NORMAL)
            ////image
            menu2_img.setImageResource(R.mipmap.footer_icon3_unselected)
            menu3_img.setImageResource(R.mipmap.footer_icon1_unselected)
            menu1_img.setImageResource(R.mipmap.footer_icon4_unselected)
        }

    }
}