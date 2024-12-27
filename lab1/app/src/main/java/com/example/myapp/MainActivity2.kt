package com.example.myapp

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
        }
    }
}