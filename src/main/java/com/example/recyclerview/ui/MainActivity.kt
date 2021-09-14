package com.example.recyclerview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.ContactAdapter
import com.example.recyclerview.models.Contacts
import com.example.recyclerview.R
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.viewmodel.ContactViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    var contactId = 0
    lateinit var binding: ActivityMainBinding
    val contactViewModel : ContactViewModel by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

    contactViewModel.getAllContacts()

      contactViewModel.getContactById(contactId)
        displayContactById(contactId)

    }

    override fun onResume() {
        super.onResume()
        contactViewModel.contactsLiveData.observe(this, {contacts ->
            displayContacts(contacts)
        })
        binding.fab.setOnClickListener {
            startActivity(Intent(this, AddContactActivity::class.java)
            )
        }
    }



    fun displayContacts(contactList: List<Contacts>){

        val contactAdapter = ContactAdapter(contactList, baseContext)

       binding.rvContacts.layoutManager = LinearLayoutManager(baseContext)
         binding.rvContacts.adapter=contactAdapter

    }

    fun displayContactById(contactId : Int){

        startActivity(Intent(baseContext, ContactDetailsActivity::class.java))
    }
}