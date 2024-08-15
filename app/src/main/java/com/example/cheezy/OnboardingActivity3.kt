package com.example.cheezy

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)

        val text = findViewById<Button>(R.id.button3)
        text.setOnClickListener{
            val intent = Intent (this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}