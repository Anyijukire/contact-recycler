package com.example.recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.recyclerview.R
import com.example.recyclerview.databinding.ActivityAddContactBinding
import com.example.recyclerview.models.Contacts
import com.example.recyclerview.viewmodel.ContactViewModel

class AddContactActivity : AppCompatActivity() {
    lateinit var binding : ActivityAddContactBinding
    val contactsViewModel: ContactViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        validateContact()
    }
    fun validateContact(){

        binding. tilName. error = null
        binding. tilEmail. error = null
        binding. tilPhone. error = null

        var name = binding.etName.text.toString()
        var email = binding.etEmail.text.toString()
        var phone = binding.etPhone.text.toString()
        var error=false

        if (email.isEmpty() || email.isBlank()){
            error= true
            binding.tilEmail.error= getString(R.string.email_required)
        }
        if (name.isEmpty() || name.isBlank()){
            error= true
            binding.tilName.error= getString(R.string.phone_required)
        }
        if (phone.isEmpty() || phone.isBlank()){
            error= true
            binding.tilPhone.error= getString(R.string.name_required)
        }
        if (!error){
            var contact = Contacts(0, name, phone, email, "")
            contactsViewModel.saveContact(contact)
            binding.etName.setText("")
            binding.etPhone.setText("")
            binding.etPhone.setText("")

        }
    }
}