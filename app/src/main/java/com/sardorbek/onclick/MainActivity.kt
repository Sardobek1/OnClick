package com.sardorbek.onclick

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sardorbek.onclick.adapter.HorizontalAdapter
import com.sardorbek.onclick.adapter.VerticalAdapter
import com.sardorbek.onclick.manager.ListManager
import com.sardorbek.onclick.util.MockData

class MainActivity : AppCompatActivity() {

    private lateinit var rvHorizontalAdapter: HorizontalAdapter
    private lateinit var rvVerticalAdapter: VerticalAdapter

    private lateinit var listManager: ListManager

    private lateinit var rvHorRecyclerView: RecyclerView
    private lateinit var rvVerRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initViews() {
        listManager = ListManager()
        rvVerticalAdapter = VerticalAdapter(listManager.getList())
        rvHorizontalAdapter = HorizontalAdapter(this, MockData.memberList())

        rvHorRecyclerView = findViewById(R.id.rvHorizontal)
        rvVerRecyclerView = findViewById(R.id.rvVertical)

        rvHorRecyclerView.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = rvHorizontalAdapter
        }
        rvVerRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = rvVerticalAdapter
        }
        rvHorizontalAdapter.onClick = {
            rvVerticalAdapter = VerticalAdapter(listManager.getList())
            rvVerRecyclerView.adapter = rvVerticalAdapter
            rvVerticalAdapter.notifyDataSetChanged()
        }
    }
}