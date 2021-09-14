package com.example.recyclerview.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.recyclerview.models.Contacts
import com.example.recyclerview.models.Note

@Database(entities = arrayOf(Contacts::class, Note::class), version = 2)
abstract class ContactsDatabase:RoomDatabase() {
    abstract fun contactDao(): ContaactDao

    abstract fun notesDao(): NotesDao

    companion object{

            var database: ContactsDatabase? = null
            fun getDatabase(context: Context): ContactsDatabase {
                if (database == null) {
                    database = Room.databaseBuilder(
                        context,
                        ContactsDatabase::class.java, "contactsDb"
                    )
                        .fallbackToDestructiveMigration().build()
                }
                return database as ContactsDatabase
            }
            }
    //singleton pattern
    //how to write migrations for room create a ui that you will use to save a note
    //pass the id of the contact n the intent and get it from the database and display the contact
}