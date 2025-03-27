package com.android.recyclerviewproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerviewproject.Data.Employee
import com.android.recyclerviewproject.Helper.EmployeeRecyclerViewAdapter

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val listOfEmployees = listOf(
            Employee("Programmer","JM","Arañas","Casipong",R.drawable.jm),
            Employee("UI/UX Designer","Gianna","_Blank_","Carreon",R.drawable.gianna)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmployeeRecyclerViewAdapter(
            listOfEmployees,
            onClick = {employee ->
                startActivity(
                    Intent(this,EmployeeDetailsActivity::class.java).apply{
                        putExtra("photo",employee.photo)
                        putExtra("firstname",employee.photo)
                        putExtra("middlename",employee.photo)
                        putExtra("lastname",employee.photo)
                        putExtra("job",employee.photo)
                    }
                )
            }
        )
    }
}