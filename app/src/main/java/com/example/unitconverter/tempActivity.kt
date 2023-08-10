package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class tempActivity : AppCompatActivity() {
    private lateinit var convertCToK : Button
    private lateinit var convertKToC : Button
    private lateinit var convertFToC : Button
    private lateinit var convertCToF : Button
    private lateinit var convertKToF : Button
    private lateinit var convertFToK : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp)
        supportActionBar?.hide()
        convertCToK = findViewById<Button>(R.id.btnCToK)
        convertKToC = findViewById<Button>(R.id.btnKToC)
        convertFToC = findViewById<Button>(R.id.btnFToC)
        convertCToF = findViewById<Button>(R.id.btnCToF)
        convertKToF = findViewById<Button>(R.id.btnKToF)
        convertFToK = findViewById<Button>(R.id.btnFToK)



        convertCToK.setOnClickListener() {
            val tempText = findViewById<EditText>(R.id.et_input)
            var value = tempText.text.toString()
            if (validIpT(value)) {
                val dispAns = findViewById<TextView>(R.id.tvResLength)
                val ans = value.toFloat() + 273
                dispAns.text = "Converted value is ${ans.toString()} K"
            }
        }

        convertKToC.setOnClickListener() {
            val tempText = findViewById<EditText>(R.id.et_input)
            var value = tempText.text.toString()
            if (validIpT(value)) {
                val dispAns = findViewById<TextView>(R.id.tvResLength)
                val ans = value.toFloat() - 273
                dispAns.text = "Converted value is ${ans.toString()} °C"
            }
        }

        convertFToC.setOnClickListener() {
            val tempText = findViewById<EditText>(R.id.et_input)
            var value = tempText.text.toString()
            if (validIpT(value)) {
                val dispAns = findViewById<TextView>(R.id.tvResLength)
                val ans = (5 * (value.toFloat() - 32)) / 9
                dispAns.text = "Converted value is ${ans.toString()} °C"
            }
        }

        convertCToF.setOnClickListener() {
            val tempText = findViewById<EditText>(R.id.et_input)
            var value = tempText.text.toString()
            if (validIpT(value)) {
                val dispAns = findViewById<TextView>(R.id.tvResLength)
                val ans = ((value.toFloat() * 9) / 5) + 32
                dispAns.text = "Converted value is ${ans.toString()} °F"
            }
        }

        convertKToF.setOnClickListener() {
            val tempText = findViewById<EditText>(R.id.et_input)
            var value = tempText.text.toString()
            if (validIpT(value)) {
                val dispAns = findViewById<TextView>(R.id.tvResLength)
                val ans = ((9 * (value.toFloat() - 273.15)) / 5) + 32
                dispAns.text = "Converted value is ${ans.toString()} °F"
            }
        }
        convertFToK.setOnClickListener() {
            val tempText = findViewById<EditText>(R.id.et_input)
            var value = tempText.text.toString()
            if (validIpT(value)) {
                val dispAns = findViewById<TextView>(R.id.tvResLength)
                val ans = ((5 * (value.toFloat() - 32)) / 9) + 273.15
                dispAns.text = "Converted value is ${ans.toString()} K"
            }
        }
    }
    private fun validIpT(number:String?):Boolean{
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