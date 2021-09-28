package com.example.kotlinedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageEdit = findViewById<EditText>(R.id.age_edit)
        val resultText = findViewById<TextView>(R.id.result_text)
        val button = findViewById<Button>(R.id.button)

        Log.d("MainActivity", "Activity Created")

        button.setOnClickListener {
            val ageString = ageEdit.text.toString()

            if (ageString.isNotEmpty()){
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                resultText.text = "Tu edad canina es de  $result años"
            } else {
                Log.d("MainActivity", "Age string is empty")
                Toast.makeText(this, "Debes insertar tu edad",Toast.LENGTH_SHORT).show()
            }
        }
    }
}