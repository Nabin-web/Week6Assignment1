package com.example.week6assignment.parcel

import com.example.week6assignment.adapter.userInfo
import com.example.week6assignment.userDetails.userDetails

class UserData(){
    companion object{
        var userList = arrayListOf<userDetails>()

        fun userData(){
            userList.add(userDetails("Nabin Kutu", "21", "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"
          , "Male", "Kathmandu"))
        }
    }
}