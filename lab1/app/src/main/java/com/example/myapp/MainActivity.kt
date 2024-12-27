package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext: Button = findViewById(R.id.button)

        buttonNext.setOnClickListener {
            val nextPage = Intent(this, MainActivity2::class.java)
            startActivity(nextPage)
        }
        val callback = onBackPressedDispatcher.addCallback(this) {
            val str = " onBackPressedCallback fired"
            val textview: TextView = findViewById(R.id.textView3)
            textview.append(str)
            finish()
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        val str = " onNewIntent called"
        val textview: TextView = findViewById(R.id.textView3)
        textview.append(str)
    }
}