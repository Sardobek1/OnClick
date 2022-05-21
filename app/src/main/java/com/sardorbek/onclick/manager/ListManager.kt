package com.sardorbek.onclick.manager

import com.sardorbek.onclick.model.User
import com.sardorbek.onclick.util.MockData

class ListManager {

    fun getList(): List<User> {
        return when (MockData.position) {
            0 -> MockData.userList()
            1 -> MockData.channelList()
            else -> MockData.birdList()
        }
    }
}