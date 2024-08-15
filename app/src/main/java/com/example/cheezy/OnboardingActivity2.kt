package com.example.cheezy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)

        val text = findViewById<Button>(R.id.button2)
        text.setOnClickListener{
            val intent = Intent (this,OnboardingActivity3::class.java)
            startActivity(intent)
        }
    }
}