package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etText = findViewById<EditText>(R.id.et_text)
        val cbSave = findViewById<CheckBox>(R.id.cb_save)
        val btnSave = findViewById<Button>(R.id.btn_save)
        val tvSavedText = findViewById<TextView>(R.id.tv_saved_text)
        val pbSavedText = findViewById<ProgressBar>(R.id.pb_saved_text)

        btnSave.setOnClickListener {
            if (cbSave.isChecked) {
                tvSavedText.text = etText.text
                pbSavedText.progress += 10
            }
        }
    }
}