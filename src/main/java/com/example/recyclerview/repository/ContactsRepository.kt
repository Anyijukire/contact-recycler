package com.example.recyclerview.repository

import androidx.lifecycle.LiveData
import com.example.recyclerview.ContactsApp
import com.example.recyclerview.database.ContactsDatabase
import com.example.recyclerview.models.Contacts
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    var database = ContactsDatabase.getDatabase(ContactsApp.context)

    suspend fun saveContact(contact: Contacts) {
        withContext(Dispatchers.IO) {
            database.contactDao().insertContact(contact)
        }
    }

    fun getAllContacts(): LiveData<List<Contacts>> {
        return database.contactDao().getAllContacts()
    }

    fun getContactById(contactId: Int): LiveData<Contacts> {
        return database.contactDao().getContactById(contactId)

    }

    //implement delete on your own
}