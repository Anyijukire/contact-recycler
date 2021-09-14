package com.example.recyclerview.database

//Database access object
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.recyclerview.models.Contacts

@Dao
interface ContaactDao {
    @Insert(onConflict =  OnConflictStrategy.REPLACE)
   fun insertContact(contact:Contacts)

    @Query("SELECT * FROM contacts")
    fun getAllContacts(): LiveData<List<Contacts>>

    @Query("SELECT * FROM contacts WHERE contactId= :contactId")
    fun getContactById(contactId:Int): LiveData<Contacts>


    @Delete
    fun deleteContact(contact: Contacts)
}