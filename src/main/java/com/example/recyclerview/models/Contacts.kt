package com.example.recyclerview.models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class Contacts(
    @PrimaryKey(autoGenerate = true) @NonNull var contactId :Int,
    var name: String,
    var email: String,
    var phoneNumber: String,
    var imageUrl:String?
)

