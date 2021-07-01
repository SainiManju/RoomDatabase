package com.example.roomdatabase_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val employees = ArrayList<Employee>()
        employees.add(Employee(1, "Name:Manju", "Designation:Intern"))
        employees.add(Employee(2, "Name:Naimish", "Designation:Intern"))
        employees.add(Employee(3, "Name:Rajnish", "Designation:Intern"))
        employees.add(Employee(4, "Name:Parul", "Designation:Intern"))

        val adapter = CustomAdapter(employees)
        recyclerView.adapter = adapter


        val db = Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java, "EmployeesDB"
        ).allowMainThreadQueries().build()
        var employeeDao  = db.empDao()
        employeeDao.insertAll(employees)
        Log.e("TAG", "onCreate: "+employeeDao.getAll() )

    }


}