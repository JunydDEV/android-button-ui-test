package com.android.button_ui_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewTitle = findViewById<TextView>(R.id.textView_title)
        val buttonPrintHello = findViewById<Button>(R.id.button_printHello)

        buttonPrintHello.setOnClickListener {
            textViewTitle.text = getString(R.string.hello_word_title)
        }
    }
}