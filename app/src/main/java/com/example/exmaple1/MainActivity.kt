package com.example.exmaple1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1 = findViewById<Button>(R.id.button_1)
        var button2 = findViewById<Button>(R.id.button_2)

        var edit = findViewById<EditText>(R.id.edit1)
        var edit1 = findViewById<EditText>(R.id.edit2)
        var text = findViewById<TextView>(R.id.text1)
        button1.setOnClickListener {
            var num1 = edit.text.toString().toInt() + edit1.text.toString().toInt()
            text.setText(num1.toString())
        }
        button2.setOnClickListener {
            edit.setText("")
            edit1.setText("")
            text.setText("")
        }
    }
}