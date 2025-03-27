package com.android.recyclerviewproject.Helper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerviewproject.Data.Employee
import com.android.recyclerviewproject.R


class EmployeeRecyclerViewAdapter(
    private val listOfEmployees: List<Employee>,
    private val onClick: (Employee) -> Unit
): RecyclerView.Adapter<EmployeeRecyclerViewAdapter.ItemViewHolder>() {
        class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
            val photo = view.findViewById<ImageView>(R.id.pic)
            val fName = view.findViewById<TextView>(R.id.firstName)
            val mName = view.findViewById<TextView>(R.id.middleName)
            val lName = view.findViewById<TextView>(R.id.lastName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_test,parent,false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = listOfEmployees.size

    override fun onBindViewHolder(
        holder: ItemViewHolder,
        position: Int
    ) {
        val item = listOfEmployees[position]

        holder.photo.setImageResource(item.photo)
        holder.fName.setText(item.firstName)
        holder.mName.setText(item.middleName)
        holder.lName.setText(item.lastName)

        holder.itemView.setOnClickListener{
            onClick(item)
        }
    }

}