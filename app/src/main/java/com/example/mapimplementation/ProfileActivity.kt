package com.example.mapimplementation

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.model.Dash

import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.content_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        ibBack.setOnClickListener{
            openDashboard()
        }
    }

    private fun openDashboard(){
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
    }

}
