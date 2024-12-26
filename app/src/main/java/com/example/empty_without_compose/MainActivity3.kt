package com.example.empty_without_compose

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val buttonNext: Button = findViewById(R.id.button5)

        buttonNext.setOnClickListener {
            val prevPage = Intent(this, MainActivity::class.java)
            startActivity(prevPage)
            finish()
        }

        val buttonPrev: Button = findViewById(R.id.button4)

        buttonPrev.setOnClickListener {
            val nextPage = Intent(this, MainActivity2::class.java)
            startActivity(nextPage)
            finish()
        }
    }
}