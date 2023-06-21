package com.example.sumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstEt: EditText = findViewById(R.id.firstEt)
        val secondEt: EditText = findViewById(R.id.secondEt)
        val resultTxt: TextView = findViewById(R.id.resultTxt)
        val sumbtn: TextView = findViewById(R.id.sumbtn)



        sumbtn.setOnClickListener {

            if (!firstEt.text.toString().equals("") && !secondEt.text.toString().equals("")){

                val ans = firstEt.text.toString().toBigDecimal() + secondEt.text.toString().toBigDecimal()
                resultTxt.text ="Sum : $ans"

            }else{
                Toast.makeText(this,"Please enter valid input",Toast.LENGTH_SHORT).show()
            }
        }


    }
}