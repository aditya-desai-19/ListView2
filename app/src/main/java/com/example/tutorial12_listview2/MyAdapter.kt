package com.example.tutorial12_listview2

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context: Activity, val arrayList: ArrayList<User>) : ArrayAdapter<User>(context, R.layout.each_item, arrayList) {

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.each_item, null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.name)
        val msg = view.findViewById<TextView>(R.id.lastMsg)
        val msgTime = view.findViewById<TextView>(R.id.lastMsgTime)

        name.text = arrayList[position].name
        msg.text = arrayList[position].lastMsg
        msgTime.text = arrayList[position].lastMsgTime
        image.setImageResource(arrayList[position].imageId)

        return view
    }
}