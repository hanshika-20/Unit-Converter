package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class weightActivity : AppCompatActivity() {
    private lateinit var convertKgTo : Button
    private lateinit var convertGTo : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight)
        supportActionBar?.hide()
        convertKgTo = findViewById<Button>(R.id.btnKgTo)
        convertGTo =findViewById<Button>(R.id.btnGTo)


        convertKgTo.setOnClickListener() {
            val weightText = findViewById<EditText>(R.id.et_input)
            var value = weightText.text.toString()
            if(validIpW(value)) {
                val dispAns = findViewById<TextView>(R.id.tvResWeight)
                val ans = value.toFloat() * 1000
                dispAns.text = "Converted value is ${ans.toString()} g"
            }
        }

        convertGTo.setOnClickListener() {
            val weightText = findViewById<EditText>(R.id.et_input)
            var value = weightText.text.toString()
            if(validIpW(value)) {
                val dispAns = findViewById<TextView>(R.id.tvResWeight)
                val ans = value.toFloat() / 1000
                dispAns.text = "Converted value is ${ans.toString()} kg"
            }
        }
    }
    private fun validIpW(number:String?):Boolean{
        return when{
            number.isNullOrEmpty()->{
                Toast.makeText(this,"Input field is empty", Toast.LENGTH_LONG).show()
                return false
            }
            else->{
                return true
            }
        }
    }
}