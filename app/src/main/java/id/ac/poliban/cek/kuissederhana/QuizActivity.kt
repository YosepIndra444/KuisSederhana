package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    private lateinit var question1RadioGroup: RadioGroup
    private lateinit var question2RadioGroup: RadioGroup
    private lateinit var submitQuizButton: Button
    private var score = 0 // Variabel untuk skor total

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        question1RadioGroup = findViewById(R.id.question1RadioGroup)
        question2RadioGroup = findViewById(R.id.question2RadioGroup)
        submitQuizButton = findViewById(R.id.submitQuizButton)

        submitQuizButton.setOnClickListener {
            checkAnswers()
            val name = intent.getStringExtra("USER_NAME")

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("USER_NAME", name)
            intent.putExtra("SCORE", score)
            startActivity(intent)
            finish()
        }
    }

    private fun checkAnswers() {
        // Memberikan skor per jawaban yang benar
        if (question1RadioGroup.checkedRadioButtonId == R.id.option1Q1) {
            score += 5 // Pertanyaan 1 benar, tambah 5 poin
        }
        if (question2RadioGroup.checkedRadioButtonId == R.id.option1Q2) {
            score += 5 // Pertanyaan 2 benar, tambah 5 poin
        }
    }
}
