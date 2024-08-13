package com.example.cheezy

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle

class SignUpActivity : AppCompatActivity(){

   override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

       val text = findViewById<TextView>(R.id.signIn)
       text.setOnClickListener{
           val intent = Intent (this,SignInActivity::class.java)
           startActivity(intent)
       }
    }
}
