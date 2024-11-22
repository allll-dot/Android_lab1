package com.example.alab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.textView)

        editText.setOnEditorActionListener{_, _, _ ->
            val input = editText.text.toString().toInt()

            var output: String
            when(input)
            {
                1 -> output = "Понедельник"
                2 -> output = "Вторник"
                3 -> output = "Среда"
                4 -> output = "Четверг"
                5 -> output = "Пятница"
                6 -> output = "Суббота"
                7 -> output = "Воскресенье"
                else -> output = "Корректный диапазон от 1 до 7"
            }

            textView.text = output

            true
        }
    }
}