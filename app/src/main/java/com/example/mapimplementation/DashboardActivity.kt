package com.example.mapimplementation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*

//This class is used for the user Dashboard of KATE mobile
class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        //Open the Map on button click
        ibSearch.setOnClickListener{
            openMap()
        }

        //open profile page
        ivProfilePicture.setOnClickListener{
            openProfile()
        }

    }

    //Start the map Activity
    private fun openMap(){
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }

    //Profile activity
    private fun openProfile(){
        val intent = Intent(this,ProfileActivity::class.java)
        startActivity(intent)
    }
}
