package com.example.recyclerview.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recyclerview.models.Contacts
import com.example.recyclerview.repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactViewModel: ViewModel() {
    val contactsRepository = ContactsRepository()
    lateinit var contactsLiveData : LiveData<List<Contacts>>
    lateinit var contactLiveData: LiveData<Contacts>

    fun saveContact(contact: Contacts){
        viewModelScope.launch {
            contactsRepository.saveContact(contact)
        }
    }

    fun getAllContacts(){
        contactsLiveData = contactsRepository.getAllContacts()
    }
    fun getContactById(contactId:Int){
        contactLiveData = contactsRepository.getContactById(contactId)
    }
}