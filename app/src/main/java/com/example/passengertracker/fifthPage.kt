package com.example.passengertracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second_page.*

class fifthPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_page)

        var intent = intent
        val province = intent.getStringExtra("Province")
        val district = intent.getStringExtra("District")
        val tumbon = intent.getStringExtra("Tumbon")
        val IDnumber = intent.getStringExtra("ID Number")
        val Phonenumber = intent.getStringExtra("Phone Number")


        val showdata = findViewById<TextView>(R.id.showdata)
        showdata.text = "ID Number :"+IDnumber+"\nPhone Number :"+ Phonenumber+"\nProvince :"+ province+"\nDistrict :"+district+"\nTumbon :"+tumbon



    }
}