package com.sardorbek.onclick.util

import androidx.lifecycle.MutableLiveData
import com.sardorbek.onclick.R
import com.sardorbek.onclick.model.Member
import com.sardorbek.onclick.model.User

object MockData {

    var pos: MutableLiveData<Int> = MutableLiveData(0)
    var position: Int = 0

    fun memberList(): List<Member> {
        return listOf(
            Member(
                "Chats"
            ),
            Member(
                "Groups"
            ),
            Member(
                "Friends"
            ),
            Member(
                "Animals"
            ),
            Member(
                "Channels"
            ),
            Member(
                "Bots"
            )
        )
    }

    fun userList(): List<User> {
        return listOf(
            User(
                R.drawable.ic_launcher_background,
                "Ulug'bek",
                "Nima gap",
                "17:52",
                "2"
            ),
            User(
                R.drawable.ic_launcher_background,
                "O'gabek",
                "Nima gap",
                "17:22",
                "15"
            ),
            User(
                R.drawable.ic_launcher_background,
                "Sardorbek",
                "Nima gap",
                "02:22",
                "3"
            ),
        )
    }

    fun channelList(): List<User> {
        return listOf(
            User(
                R.drawable.ic_launcher_background,
                "Vodiy bozor",
                "Moshina",
                "17:52",
                "15"
            ),
            User(
                R.drawable.ic_launcher_background,
                "Futbol Tv",
                "Ronaldo",
                "14:00",
                "7"
            ),
        )
    }

    fun birdList(): List<User> {
        return listOf(
            User(
                R.drawable.ic_launcher_background,
                "Burgut",
                "Tezligi 110 km",
                "17:52",
                "6"
            ),
            User(
                R.drawable.ic_launcher_background,
                "Lochin",
                "Tez",
                "14:00",
                "4"
            ),
        )
    }
}