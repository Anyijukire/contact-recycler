package com.example.recyclerview

import android.app.Application
import android.content.Context

class ContactsApp: Application() {
    companion object{
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}