package com.example.passengertracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second_page.*
import kotlinx.android.synthetic.main.activity_third_page.*

class thirdPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)

        var intent = intent
        val IDnumber = intent.getStringExtra("ID Number")


        val next3 = findViewById<Button>(R.id.next3)

        next3.setOnClickListener{
            //val intent = Intent( this, fourthPage::class.java)

            val Phonenumber = PhonenumberEt.text.toString()


            val intent = Intent(this@thirdPage, fourthPage::class.java)
            intent.putExtra("ID Number",IDnumber)
            intent.putExtra("Phone Number",Phonenumber)

            startActivity(intent)
        }

        val previous3 = findViewById<Button>(R.id.previous3)
        previous3.setOnClickListener{
            val intent = Intent( this, secondPage::class.java)

            startActivity(intent)
        }


        //val resultTv = findViewById<TextView>(R.id.resultTv)
        //resultTv.text = "ID Number :"+ IDnumber
    }
}