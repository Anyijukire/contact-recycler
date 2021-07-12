package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    lateinit var rvContacts: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayContacts()
    }
    fun displayContacts(){
        val contactList = listOf<Contacts>(Contacts("Janet", "anyijukirjanett@gmail.com", "0783649473"),
            Contacts("Onesmas","aijukaonesagmail.com", "0756544421"),
            Contacts("Ruth", "anyijukirjanett@gmail.com", "0783649473"),
            Contacts("Esther","estherayebazagmail.com", "0756544421"),
            Contacts("Frank", "aboewurieet@gmail.com", "0783649473"),
            Contacts("Blessed","ayebarebless88azagmail.com", "0756544421"),
            Contacts("Dankan", "anyijukirjanett@gmail.com", "0783649473"),
            Contacts("Peruth","peruthebazagmail.com", "0756544421"))
    rvContacts = findViewById(R.id.rvContacts)
        var contactAdapter = ContactAdapter(contactList)

       rvContacts.layoutManager = LinearLayoutManager(baseContext)
         rvContacts.adapter=contactAdapter

    }
}