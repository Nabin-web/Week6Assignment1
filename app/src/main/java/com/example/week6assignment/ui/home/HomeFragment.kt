package com.example.week6assignment.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week6assignment.MainActivity
import com.example.week6assignment.R
import com.example.week6assignment.adapter.userInfo
import com.example.week6assignment.parcel.UserData
import com.example.week6assignment.ui.dashboard.DashboardFragment
import com.example.week6assignment.userDetails.userDetails

class HomeFragment : Fragment(), View.OnClickListener {

   private  lateinit var userRecyclerView:RecyclerView


    private var userList= ArrayList<userDetails>()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        userRecyclerView = root.findViewById(R.id.userRecyclerView)




        if(UserData.userList.size==0){
            UserData.userData()
        }


        userList = UserData.userList
        val adapter = userInfo(userList, container!!.context)
        userRecyclerView.layoutManager = LinearLayoutManager(context)
        userRecyclerView.adapter = adapter
        return root

    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }


}