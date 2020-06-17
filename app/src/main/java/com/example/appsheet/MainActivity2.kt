package com.example.appsheet

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.net.toUri
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
/*
        val bundle: Bundle? = intent.extras
        val img = bundle!!.getString("img")
        val uri = Uri.parse(img)
        image_view.setImageURI(uri)
*/
        val bundle: Bundle? = intent.extras
        val names = bundle!!.getString("named")
        Toast.makeText(this, names, Toast.LENGTH_SHORT).show()


    }

}