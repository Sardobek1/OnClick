package com.sardorbek.onclick.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sardorbek.onclick.R
import com.sardorbek.onclick.model.Member
import com.sardorbek.onclick.util.MockData

class HorizontalAdapter(
    private val context: Context,
    private val memberList: List<Member>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    lateinit var onClick: (Int) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.tableitem, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewHolder) {
            holder.titleTv.text = memberList[position].titleTv
        }
        holder.itemView.setOnClickListener {
            MockData.position = position
            onClick.invoke(position)
        }
    }

    override fun getItemCount(): Int {
        return memberList.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTv: TextView = itemView.findViewById(R.id.textView)
    }
}