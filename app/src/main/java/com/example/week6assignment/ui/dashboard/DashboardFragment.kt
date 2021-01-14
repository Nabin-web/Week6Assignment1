package com.example.week6assignment.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week6assignment.MainActivity
import com.example.week6assignment.R
import com.example.week6assignment.adapter.userInfo
import com.example.week6assignment.parcel.UserData
import com.example.week6assignment.parcel.UserData.Companion.userData
import com.example.week6assignment.parcel.UserData.Companion.userList
import com.example.week6assignment.userDetails.userDetails

class DashboardFragment : Fragment() {


    private lateinit var etFullname: EditText
    private lateinit var rbFemale: RadioButton
    private lateinit var rbMale: RadioButton
    private lateinit var etAge: EditText
    private lateinit var etAddress: EditText
    private lateinit var etImage: EditText
    private lateinit var btnAdd: Button
    var gender = ""


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        binding(root)
        btnAdd = root.findViewById(R.id.btnAdd)

        btnAdd.setOnClickListener {

            if (rbMale.isChecked) {
                gender = "Male"
            } else if (rbFemale.isChecked) {
                gender = "Female"
            }
            userList.add(userDetails(etFullname.text.toString(), etAge.text.toString(), etImage.text.toString(), gender, etAddress.text.toString()))
            Toast.makeText(context, etFullname.text.toString(), Toast.LENGTH_SHORT).show()
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)

        }
        return root
    }

    private fun binding(root: View?) {
        if (root != null) {
            etFullname = root.findViewById(R.id.etFullName)
        }
        if (root != null) {
            etAge = root.findViewById(R.id.etAge)
        }
        if (root != null) {
            etAddress = root.findViewById(R.id.etAddress)
        }
        if (root != null) {
            rbMale = root.findViewById(R.id.rbMale)
        }
        if (root != null) {
            rbFemale = root.findViewById(R.id.rbFemale)
        }
        if (root != null) {
            etImage = root.findViewById(R.id.etImageLink)
        }
    }

}