package com.example.week6assignment.parcel

import com.example.week6assignment.adapter.userInfo
import com.example.week6assignment.userDetails.userDetails

class UserData(){
    companion object{
        var userList = arrayListOf<userDetails>()

        fun userData(){
            userList.add(userDetails("Nabin Kutu", "21", "https://i.pinimg.com/736x/89/90/48/899048ab0cc455154006fdb9676964b3.jpg"
          , "Male", "Kathmandu"))
        }
    }
}