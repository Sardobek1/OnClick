package com.sardorbek.onclick.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sardorbek.onclick.R
import com.sardorbek.onclick.model.User

class VerticalAdapter(val userList: List<User>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemone,parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


        if (holder is CustomViewHolder ){

            holder.imageview.setImageResource(userList[position].icon)
            holder.title.text= userList[position].title
            holder.saptitle.text= userList[position].subtitle
            holder.time.text= userList[position].time
            holder.message.text= userList[position].message
        }
    }
    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageview = itemView.findViewById<ImageView>(R.id.imageview)
        val title = itemView.findViewById<TextView>(R.id.textname)
        val saptitle = itemView.findViewById<TextView>(R.id.texttitle)
        val time = itemView.findViewById<TextView>(R.id.texttime)
        val message = itemView.findViewById<TextView>(R.id.sms)
    }}
