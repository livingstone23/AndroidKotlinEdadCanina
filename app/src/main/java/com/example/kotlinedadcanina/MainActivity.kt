package com.example.kotlinedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.kotlinedadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val ageEdit = binding.ageEdit
        val resultText = binding.resultText
        val button = binding.button

        Log.d("MainActivity", "Activity Created")

        button.setOnClickListener {
            val ageString = ageEdit.text.toString()

            if (ageString.isNotEmpty()){
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                resultText.text = getString(R.string.result_text, result)
            } else {
                Log.d("MainActivity", "Age string is empty")
                Toast.makeText(this, getString(R.string.you_must_insert_age),Toast.LENGTH_SHORT).show()
            }
        }
    }
}