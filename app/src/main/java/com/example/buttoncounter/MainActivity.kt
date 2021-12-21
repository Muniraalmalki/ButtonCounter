package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv: TextView
    private lateinit var add: Button
    private lateinit var minus: Button
    var count = 26
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.tv)
        add = findViewById(R.id.addButton)
        minus = findViewById(R.id.minusButton)


        add.setOnClickListener {
            count++
            tv.text = count.toString()
        }
        minus.setOnClickListener {
            count--
            tv.text = count.toString()
        }
    }
    }
