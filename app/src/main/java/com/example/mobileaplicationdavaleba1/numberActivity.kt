package com.example.mobileaplicationdavaleba1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NumberActivity : AppCompatActivity() {

    private lateinit var welcomeTextView: TextView
    private lateinit var counterTextView: TextView
    private lateinit var clickButton: Button
    private var counter = 100 //

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)


        welcomeTextView = findViewById(R.id.welcome_text_view)
        counterTextView = findViewById(R.id.counter_text_view)
        clickButton = findViewById(R.id.button)


        val email = intent.getStringExtra("USER_EMAIL") ?: "Guest"
        welcomeTextView.text = "Welcome back! $email"


        counterTextView.text = counter.toString()


        clickButton.setOnClickListener {
            counter--
            counterTextView.text = counter.toString()
        }
    }


    override fun onDestroy() {
        super.onDestroy()

    }
}