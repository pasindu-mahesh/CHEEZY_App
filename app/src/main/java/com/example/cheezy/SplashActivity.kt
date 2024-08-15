package com.example.cheezy

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity



@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        // Use Handler with Looper.getMainLooper() to avoid deprecation warning
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnboardingActivity1::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3 seconds
    }
}