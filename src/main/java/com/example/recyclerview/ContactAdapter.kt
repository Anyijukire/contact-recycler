package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter (var contactList : List<Contacts>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_display_activity,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact = contactList.get(position)
        holder.textView2.text=currentContact.name
        holder.textView3.text=currentContact.phoneNumber
        holder.textView4.text=currentContact.email
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var textView2=itemView.findViewById<TextView>(R.id.textView2)
    var textView3=itemView.findViewById<TextView>(R.id.textView3)
    var textView4=itemView.findViewById<TextView>(R.id.textView4)
}