package com.example.empty_without_compose

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonNext: Button = findViewById(R.id.button3)

        buttonNext.setOnClickListener {
            val prevPage = Intent(this, MainActivity3::class.java)
            startActivity(prevPage)
            finish()
        }

        val buttonPrev: Button = findViewById(R.id.button2)

        buttonPrev.setOnClickListener {
            val nextPage = Intent(this, MainActivity::class.java)
            startActivity(nextPage)
            finish()
        }

    }
}