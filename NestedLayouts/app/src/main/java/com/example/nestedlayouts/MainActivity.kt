package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    var counter = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll = findViewById<Button>(R.id.btn_roll)

        btnRoll.setOnClickListener{
            var index = counter % 3
            if (index == 0){
                index = 3
            }
            for (i in 1..3) {
                val tvPrevious = findViewById<TextView>(resources.getIdentifier("tv_" + i + "_" + index, "id", packageName))
                tvPrevious.text = ""
            }
            counter++
            index = counter % 3
            if (index == 0){
                index = 3
            }
            for (i in 1..3) {
                val tvNext = findViewById<TextView>(resources.getIdentifier("tv_" + i + "_" + index, "id", packageName))
                tvNext.text = counter.toString()
            }
        }
    }
}