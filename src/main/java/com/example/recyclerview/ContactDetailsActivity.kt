package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class ContactDetailsActivity : AppCompatActivity() {
lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        button=findViewById(R.id.button)

        button.setOnClickListener {
            val intent1=Intent(baseContext,MainActivity::class.java)
            startActivity(intent1)
        }
        val name =intent.getStringExtra("name")
        val phoneNumber =intent.getStringExtra("phoneNumber")
        val email =intent.getStringExtra("email")
        val imageUrl =intent.getStringExtra("image")

        val intentName = findViewById<TextView>(R.id.tvname1)
        val phone = findViewById<TextView>(R.id.tvPhone1)
        val email2= findViewById<TextView>(R.id.tvEmail1)
        val image=findViewById<ImageView>(R.id.imageView)

        Picasso.get().load(imageUrl)
            .resize(80,80)
            .centerCrop().into(image)
        intentName.text=name
        phone.text=phoneNumber
        email2.text=email
    }
}