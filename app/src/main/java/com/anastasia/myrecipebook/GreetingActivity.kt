package com.anastasia.myrecipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import java.util.*
import kotlin.concurrent.schedule

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

// This activity is set as launcher to display picture of My recipe book with 3 seconds delay
        val intentMainActivity = Intent(this, MainActivity::class.java)

        Handler().postDelayed({startActivity(intentMainActivity)}, 3000)
    }
}