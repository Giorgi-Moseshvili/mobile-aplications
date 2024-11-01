package com.example.mobileaplicationdavaleba1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var okayButton: Button
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        emailEditText = findViewById(R.id.Email_edit_text)
        okayButton = findViewById(R.id.Okay_button)
        nextButton = findViewById(R.id.Next_button)


        okayButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val intent = Intent(this, NumberActivity::class.java)
            intent.putExtra("USER_EMAIL", email)
            startActivity(intent)
        }


        nextButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val intent = Intent(this, NumberActivity::class.java)
            intent.putExtra("USER_EMAIL", email)
            startActivity(intent)
        }
    }
}