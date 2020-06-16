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
    var image_uri: Uri? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle: Bundle? = intent.extras
        val img = bundle!!.getString("img")
        //image_uri = intent.getParcelableExtra("img")
        //image_uri = img!!.toUri()
        val uri = Uri.parse(img)
        //image_view.setImageURI(uri)
        Toast.makeText(this, img, Toast.LENGTH_SHORT).show()
        //txtT.text = img

    }

}