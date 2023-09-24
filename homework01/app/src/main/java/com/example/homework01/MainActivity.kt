package com.example.homework01

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button0: Button = findViewById(R.id.button0)
        button0.setOnClickListener{
            changeValueNumber("0")
        }
        val buttonErase: Button = findViewById(R.id.buttonErase)
        buttonErase.setOnClickListener{
            changeValueNumber("<")
        }
        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener{
            changeValueNumber("1")
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener{
            changeValueNumber("2")
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener{
            changeValueNumber("3")
        }
        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener{
            changeValueNumber("4")
        }
        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener{
            changeValueNumber("5")
        }
        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener{
            changeValueNumber("6")
        }
        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener{
            changeValueNumber("7")
        }
        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener{
            changeValueNumber("8")
        }
        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener{
            changeValueNumber("9")
        }

        val buttonCall: Button = findViewById(R.id.buttonCall)
        buttonCall.setOnClickListener{
            val numView: TextView = findViewById(R.id.textViewNum)
            dialPhoneNumber(numView.text.toString())
        }

    }
    private fun changeValueNumber(num: String){
        val numView: TextView = findViewById(R.id.textViewNum)
        if(num == "<"){
            numView.text = numView.text.toString().dropLast(1)
        }else{
            numView.text = numView.text.toString() + num
        }
    }

    private fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else{
            println("not working")
        }
    }

}