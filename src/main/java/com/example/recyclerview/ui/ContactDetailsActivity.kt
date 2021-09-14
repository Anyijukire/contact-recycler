package com.example.recyclerview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.recyclerview.R
import com.example.recyclerview.databinding.ActivityContactDetailsBinding


class ContactDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityContactDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


         binding.button.setOnClickListener {
            val intent1=Intent(baseContext, MainActivity::class.java)
            startActivity(intent1)
        }
        val contactId = intent.getStringExtra("contactId")
//        val name =intent.getStringExtra("name")
//        val phoneNumber =intent.getStringExtra("phone")
//        val email =intent.getStringExtra("email")
//        val imageUrl =intent.getStringExtra("image")

//        val intentName = findViewById<TextView>(R.id.tvname1)
//        val phone = findViewById<TextView>(R.id.tvPhone1)
//        val email2= findViewById<TextView>(R.id.tvEmail1)
//        val image=findViewById<ImageView>(R.id.imageView)
        val textView = findViewById<TextView>(R.id.textView)


//        Picasso.get().load(imageUrl)
//            .resize(80,80)
//            .centerCrop().into(image)
        textView.text=contactId
//        intentName.text=name
//        phone.text=phoneNumber
//        email2.text=email
    }
}