package com.example.roomdatabase_task

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(EmployeeTable::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun empDao() : EmployeeDao
}


