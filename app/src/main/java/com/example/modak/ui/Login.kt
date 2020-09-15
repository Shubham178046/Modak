package com.example.modak.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.modak.R
import com.example.modak.ui.Register
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

//   var textInputLayout :TextInputLayout= findViewById(R.id.textinput)
//   var textInputLayout1 :TextInputLayout =findViewById(R.id.textinput1)





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // hide status bar
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
        val signup :TextView= findViewById(R.id.txt_Signup)
        var button :Button= findViewById(R.id.login_btn)

        signup.setOnClickListener {
            startActivity(Intent(applicationContext, Register::class.java))
        }

        button.setOnClickListener {
            confirm()
        }

    }

   private fun confirm()
    {
//        var edtemail :TextInputEditText = findViewById(R.id.edtemail)
//        var email :String = edtemail.text.toString().trim()
//
//
//        var edtpass: TextInputEditText=findViewById(R.id.edtpassword)
//
//        var password :String = edtpass.text.toString().trim()


        if(edtemail.text.toString().isEmpty())
        {
            edtemail.error="Email Should Not Be Blank"
        }
        else if(edtpassword.text.toString().isEmpty())
        {
            edtpassword.error="Password Should Not Be Blank"
        }
//        else if(edtemail.text.toString().isEmpty() || edtpassword.text.toString().isEmpty())
//        {
//            edtemail.error="Email Should Not Be Blank"
//            edtpassword.error="Password Should Not Be Blank"
//        }
        else{

            startActivity(Intent(applicationContext,Home_Navigation::class.java))

            Toast.makeText(applicationContext,"Done",Toast.LENGTH_LONG).show()
        }

    }
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}
