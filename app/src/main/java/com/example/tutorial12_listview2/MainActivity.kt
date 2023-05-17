package com.example.tutorial12_listview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.tutorial12_listview2.MyAdapter

class MainActivity : AppCompatActivity() {

    lateinit var UserArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val names = arrayOf("Virat", "MS Dhoni", "Sachin", "Rohit", "Hardik")

        val messages = arrayOf("Hey", "Hello", "Namaskar", "Ky bolta hai bhai?", "Namaskar bhai log")

        val msgTime = arrayOf("2:30 PM", "2:31 PM", "2:32 PM", "2:34 PM", "2:35 PM")

        val phone = arrayOf("9087900056", "8087900056", "9487900056", "9687900056", "8087900056")

        val imgId = intArrayOf(R.drawable.virat, R.drawable.ms, R.drawable.sachin, R.drawable.rohit, R.drawable.hardik)

        UserArrayList = ArrayList()

        for (i in names.indices) {
            val user = User(names[i], messages[i], msgTime[i], phone[i], imgId[i])
            UserArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.lv)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, UserArrayList)
    }
}