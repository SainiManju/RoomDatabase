package com.example.roomdatabase_task

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
@Dao
interface EmployeeDao {
    @Query("SELECT * FROM employee")
    fun getAll(): List<EmployeeTable>
    @Insert
    fun insertAll(employees: ArrayList<Employee>)
}
