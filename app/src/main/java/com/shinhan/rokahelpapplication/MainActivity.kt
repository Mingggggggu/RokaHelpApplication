package com.shinhan.rokahelpapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        settingButton()
    }
    fun settingButton() {
        val btn1 = findViewById<TextView>(R.id.daysujungbtn)
        btn1.setOnClickListener {
            val intent = Intent(this, DaysujungActivity::class.java)
            startActivity(intent)
        }
        val btn2 = findViewById<TextView>(R.id.wantsujungbtn)
        btn2.setOnClickListener {
            val intent = Intent(this, WannabeActivity::class.java)
            startActivity(intent)
        }
        val btn3 = findViewById<Button>(R.id.mozipckbtn)
        btn3.setOnClickListener {
            val intent = Intent(this, MozipActivity::class.java)
            startActivity(intent)
        }
        val btn4 = findViewById<Button>(R.id.specialckbtn)
        btn4.setOnClickListener {
            val intent = Intent(this, SpecialActivity::class.java)
            startActivity(intent)
        }
    }
}