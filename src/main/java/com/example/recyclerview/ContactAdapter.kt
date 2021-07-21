package com.example.recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter (var contactList : List<Contacts>, var context:Context):RecyclerView.Adapter<ContactViewHolder>(){
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


        holder.cvContact.setOnClickListener {
            val intent=Intent(context,ContactDetailsActivity::class.java)
            intent.putExtra("name", currentContact.name)
            intent.putExtra("phone",currentContact.phoneNumber)
            intent.putExtra("email",currentContact.email)
            intent.putExtra("image",currentContact.imageUrl)

            context.startActivity(intent)
        }
        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.ivContact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var textView2=itemView.findViewById<TextView>(R.id.textView2)
    var textView3=itemView.findViewById<TextView>(R.id.textView3)
    var textView4=itemView.findViewById<TextView>(R.id.textView4)
    var ivContact=itemView.findViewById<ImageView>(R.id.ivContact)
    var cvContact=itemView.findViewById<CardView>(R.id.cvContact)
}