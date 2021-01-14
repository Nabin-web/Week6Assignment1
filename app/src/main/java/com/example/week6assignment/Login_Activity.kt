package com.example.week6assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login_Activity : AppCompatActivity(), View.OnClickListener {
    private lateinit var etUsername : EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnLogin -> {
                if (etUsername.text.toString() == "25C" && etPassword.text.toString() == "25C") {
                    val intent = Intent(this, MainActivity::class.java)
                    Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show()
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Please enter valid username or password", Toast
                                    .LENGTH_SHORT).show()
                }

            }
        }
    }
}