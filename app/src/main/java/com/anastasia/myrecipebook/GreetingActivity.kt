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


        val intentMainActivity = Intent(this, MainActivity::class.java)

        Handler().postDelayed({startActivity(intentMainActivity)}, 3000)
    }
}