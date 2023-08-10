package com.example.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.core.os.postDelayed

class MainActivity : AppCompatActivity() {
    private lateinit var length : Button
    private lateinit var weight : Button
    private lateinit var temp : Button
    private lateinit var area : Button
    private lateinit var vol : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        length = findViewById<Button>(R.id.btnLength)
        weight = findViewById<Button>(R.id.btnWeight)
        temp = findViewById<Button>(R.id.btnTemperature)


        length.setOnClickListener(){
            Handler(Looper.getMainLooper()).postDelayed(3000) {
                val intent = Intent(this, heightActivity::class.java)
                startActivity(intent)
            }
        }
        weight.setOnClickListener(){
            Handler(Looper.getMainLooper()).postDelayed(3000) {
                val intent1 = Intent(this, weightActivity::class.java)
                startActivity(intent1)
            }
        }
        temp.setOnClickListener(){
            Handler(Looper.getMainLooper()).postDelayed(3000) {
                val intent2 = Intent(this, tempActivity::class.java)
                startActivity(intent2)
            }
        }

//        area.setOnClickListener(){
//            Handler(Looper.getMainLooper()).postDelayed(3000) {
//                val intent3 = Intent(this, areaActivity::class.java)
//                startActivity(intent3)
//            }
//        }
//
//        vol.setOnClickListener(){
//            Handler(Looper.getMainLooper()).postDelayed(3000) {
//                val intent4 = Intent(this, tempActivity::class.java)
//                startActivity(intent4)
//            }
//        }
    }
}