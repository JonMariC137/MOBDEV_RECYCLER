package com.android.recyclerviewproject

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EmployeeDetailsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_details)

        val photo = findViewById<ImageView>(R.id.pic)
        val fName = findViewById<TextView>(R.id.firstname)
        val mName = findViewById<TextView>(R.id.middleName)
        val lName = findViewById<TextView>(R.id.lastName)
        val job = findViewById<TextView>(R.id.job)

        intent?.let {
            it?.getIntExtra("photo",R.drawable.gianna)?.let { photoId ->
                photo.setImageResource(photoId)
            }
        }
    }
}