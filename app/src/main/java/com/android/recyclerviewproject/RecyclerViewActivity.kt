package com.android.recyclerviewproject

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerviewproject.Data.Employee
import com.android.recyclerviewproject.Helper.EmployeeRecyclerViewAdapter

class RecyclerViewActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val listOfEmployees = listOf(
            Employee("001","JM","Arañas","Casipong",R.drawable.gianna),
            Employee("001","JM","Arañas","Casipong",R.drawable.gianna),
            Employee("001","JM","Arañas","Casipong",R.drawable.gianna)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmployeeRecyclerViewAdapter(
            listOfEmployees, onClick = {}
        )
    }
}