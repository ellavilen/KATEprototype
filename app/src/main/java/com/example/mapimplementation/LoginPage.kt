package com.example.mapimplementation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_page.*

//This class is used to log check the user details in to Kate mobile
class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        btnSignIn.setOnClickListener {
            startActivity(Intent(this, VerifyLoginPage::class.java))
        }
    }

}
