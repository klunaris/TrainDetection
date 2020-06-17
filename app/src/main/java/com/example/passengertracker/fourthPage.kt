package com.example.passengertracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_fourth_page.*
import kotlinx.android.synthetic.main.activity_second_page.*

class fourthPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_page)

        var intent = intent
        val IDnumber = intent.getStringExtra("ID Number")
        val Phonenumber = intent.getStringExtra("Phone Number")

        val next4 = findViewById<Button>(R.id.next4)

        next4.setOnClickListener{
            //val intent = Intent( this, fifthPage::class.java)
            val province = provinceEt.text.toString()
            val district = districtEt.text.toString()
            val tumbon   = tumbonEt.text.toString()

            val intent = Intent(this@fourthPage, fifthPage::class.java)
            intent.putExtra("Province",province)
            intent.putExtra("District",district)
            intent.putExtra("Tumbon",tumbon)
            intent.putExtra("ID Number",IDnumber)
            intent.putExtra("Phone Number",Phonenumber)

            startActivity(intent)
        }

        val previous4 = findViewById<Button>(R.id.previous4)
        previous4.setOnClickListener{
            val intent = Intent( this, thirdPage::class.java)

            startActivity(intent)
        }

        //val resultTv2 = findViewById<TextView>(R.id.resultTv2)
        //resultTv2.text = "ID Number :"+ IDnumber

    }
}