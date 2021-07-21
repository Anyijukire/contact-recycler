package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    lateinit var rvContacts: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayContacts()
    }
    fun displayContacts(){
        val contactList = listOf<Contacts>(Contacts("Janet", "anyijukirjanett@gmail.com", "0783649473","https://i.vimeocdn.com/portrait/53300265_640x640"),
            Contacts("Onesmas","aijukaonesagmail.com", "0756544421","https://scontent.fnbo12-1.fna.fbcdn.net/v/t1.6435-0/c0.116.206.206a/p206x206/117199512_1189048834804708_8805404185725736519_n.jpg?_nc_cat=100&ccb=1-3&_nc_sid=da31f3&_nc_ohc=uh6o8aTHNJQAX8UUIJR&_nc_ht=scontent.fnbo12-1.fna&oh=fcc9437efdc61ae124a43e6a81a59c91&oe=60F5DE0A"),
            Contacts("Ruth", "anyijukirjanett@gmail.com", "0783649473","https://scontent.fnbo12-1.fna.fbcdn.net/v/t1.6435-0/c0.134.206.206a/p206x206/112797014_1174223069620618_1829437531766257710_n.jpg?_nc_cat=106&ccb=1-3&_nc_sid=da31f3&_nc_ohc=1MRjES_SMgwAX-kuZn_&_nc_ht=scontent.fnbo12-1.fna&oh=c301dc77fee9874a6796dc1986e2c812&oe=60F54367"),
            Contacts("Esther","estherayebazagmail.com", "0756544421","https://scontent.fnbo12-1.fna.fbcdn.net/v/t1.6435-0/c0.48.206.206a/p206x206/101959162_1135331756843083_8304840933543772160_n.jpg?_nc_cat=101&ccb=1-3&_nc_sid=da31f3&_nc_ohc=uB59190YkycAX-edBBB&_nc_ht=scontent.fnbo12-1.fna&oh=07c33222ba4ac0468f64b4d9bda59540&oe=60F489A6"),
            Contacts("Frank", "aboewurieet@gmail.com", "0783649473","https://scontent.fnbo12-1.fna.fbcdn.net/v/t1.6435-0/c78.0.206.206a/p206x206/95152705_1106648309711428_2147304281575784448_n.jpg?_nc_cat=107&ccb=1-3&_nc_sid=da31f3&_nc_ohc=b-D9g2r4-o8AX8bsW8V&_nc_ht=scontent.fnbo12-1.fna&oh=052d6f5706176eade8ba389d59c232b4&oe=60F62AC2"),
            Contacts("Blessed","ayebarebless88azagmail.com", "0756544421","https://scontent.fnbo12-1.fna.fbcdn.net/v/t1.6435-0/c0.45.206.206a/p206x206/69800089_899098013799793_5164368955606827008_n.jpg?_nc_cat=109&ccb=1-3&_nc_sid=da31f3&_nc_ohc=PdTxmA5tOLMAX8d-ya-&_nc_ht=scontent.fnbo12-1.fna&oh=0da8f8144ae1ded54a3f29c9693d9291&oe=60F4F341"),
            Contacts("Dankan", "anyijukirjanett@gmail.com", "0783649473","https://scontent.fnbo12-1.fna.fbcdn.net/v/t1.6435-9/210343147_1438594886516767_8854183929213597078_n.jpg?_nc_cat=104&ccb=1-3&_nc_sid=5b7eaf&_nc_ohc=ZVx70VuF_W0AX8eDLou&_nc_ht=scontent.fnbo12-1.fna&oh=fc755bd746e90efc3f1700e5ef951923&oe=60F544FB"),
            Contacts("Peruth","peruthebazagmail.com", "0756544421","https://scontent.fnbo12-1.fna.fbcdn.net/v/t1.6435-9/207585203_1438595246516731_345945091941605890_n.jpg?_nc_cat=101&ccb=1-3&_nc_sid=5b7eaf&_nc_ohc=4XDtnqvQT88AX9VVm_I&_nc_ht=scontent.fnbo12-1.fna&oh=f26336aa9ce7d6f55fe45056c314a381&oe=60F5F85E"))
    rvContacts = findViewById(R.id.rvContacts)
        val contactAdapter = ContactAdapter(contactList, baseContext)

       rvContacts.layoutManager = LinearLayoutManager(baseContext)
         rvContacts.adapter=contactAdapter

    }
}