package com.example.week6assignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.week6assignment.R
import com.example.week6assignment.userDetails.userDetails
import de.hdodenhof.circleimageview.CircleImageView
 private lateinit var btndelete: Button
class userInfo(val lstUsers: ArrayList<userDetails>, val context: Context): RecyclerView.Adapter<userInfo.UserViewHolder>() {
    class UserViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgProfile: CircleImageView
        val fullName: TextView
        val age:TextView
        val address: TextView
        val gender : TextView


        init {
            imgProfile = view.findViewById(R.id.imgProfile)
            fullName = view.findViewById(R.id.tvFullName)
            age = view.findViewById(R.id.tvAge)
            address= view.findViewById(R.id.tvAddress)
            gender = view.findViewById(R.id.tvGender)
            btndelete = view.findViewById(R.id.delete)


        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview, parent, false)

        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val user = lstUsers[position]
        holder.fullName.text = user.fullName
        holder.age.text = user.age.toString()
        holder.address.text = user.address
        holder.gender.text = user.gender

        Glide.with(context).load(user.profileImg).into(holder.imgProfile)

        btndelete.setOnClickListener{
            lstUsers.removeAt(position)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return lstUsers.size
    }
}