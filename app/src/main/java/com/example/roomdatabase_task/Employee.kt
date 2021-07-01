package com.example.roomdatabase_task

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employee")
data class Employee(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "designation") val designation: String?
)

