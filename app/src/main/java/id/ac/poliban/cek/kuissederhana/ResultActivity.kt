package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private lateinit var restartQuizButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultTextView = findViewById(R.id.resultTextView)
        restartQuizButton = findViewById(R.id.restartQuizButton)

        // Ambil nama dan skor dari QuizActivity
        val name = intent.getStringExtra("USER_NAME")
        val score = intent.getIntExtra("SCORE", 0)

        // Tampilkan skor keseluruhan
        resultTextView.text = "Congratulations, $name!\nYour Total Score: $score / 10"

        // Tombol untuk kembali ke MainActivity
        restartQuizButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
