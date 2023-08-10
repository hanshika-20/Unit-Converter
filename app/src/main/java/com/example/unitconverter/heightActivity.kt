package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class heightActivity : AppCompatActivity() {
    private lateinit var convertMTo: Button
    private lateinit var convertCmTo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_height)
        supportActionBar?.hide()
        convertMTo = findViewById<Button>(R.id.btnMTo)
        convertCmTo = findViewById<Button>(R.id.btnCmTo)


        convertMTo.setOnClickListener() {
            val lengthText = findViewById<EditText>(R.id.et_input)
            var value = lengthText.text.toString()
            if (validIpH(value)) {


                var dispAns = findViewById<TextView>(R.id.tvResLength)
                val ans = value.toFloat() * 100
                dispAns.text = "Converted value is ${ans.toString()} cm"
            }
        }

        convertCmTo.setOnClickListener() {
            val lengthText = findViewById<EditText>(R.id.et_input)
            var value = lengthText.text.toString()
            if (validIpH(value)) {
                var dispAns = findViewById<TextView>(R.id.tvResLength)
                val ans = value.toFloat() / 100
                dispAns.text = "Converted value is ${ans.toString()} m"

            }
        }
    }
    private fun validIpH(number: String?): Boolean {
        return when {
            number.isNullOrEmpty() -> {
                Toast.makeText(this, "Input field is empty", Toast.LENGTH_LONG).show()
                return false
            }
            else -> {
                return true
            }
        }
    }
}
