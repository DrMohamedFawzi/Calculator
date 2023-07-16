package com.msn.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus = findViewById<Button>(R.id.Plus)
        val minus = findViewById<Button>(R.id.Minus)
        val divide = findViewById<Button>(R.id.Divid)
        val multi = findViewById<Button>(R.id.Multi)

        val input1 = findViewById<EditText>(R.id.No1)
        val input2 = findViewById<EditText>(R.id.No2)

        val Result = findViewById<TextView>(R.id.Result)

        multi.setOnClickListener {
            val value1 = input1.text.toString().toInt()
            val value2 = input2.text.toString().toInt()
            val result = value1 * value2
            Result.text = result.toString()
        }

        minus.setOnClickListener {
            val value1 = input1.text.toString().toInt()
            val value2 = input2.text.toString().toInt()
            val result = value1 - value2
            Result.text = result.toString()
        }



        plus.setOnClickListener {
            val value1 = input1.text.toString().toInt()
            val value2 = input2.text.toString().toInt()
            val result = value1 + value2
            Result.text = result.toString()
        }

        divide.setOnClickListener {
            val value1 = input1.text.toString().toInt()
            val value2 = input2.text.toString().toInt()
            val result = value1 / value2
            Result.text = result.toString()
        }










    }}