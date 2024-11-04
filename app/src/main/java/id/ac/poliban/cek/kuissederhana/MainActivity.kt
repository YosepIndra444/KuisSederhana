package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var startQuizButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.nameEditText)
        startQuizButton = findViewById(R.id.startQuizButton)

        startQuizButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("USER_NAME", name)
            startActivity(intent)
        }
    }
}
