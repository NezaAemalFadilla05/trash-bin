package com.aplikasi.trashbin.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aplikasi.trashbin.database.dao.DatabaseDao
import com.aplikasi.trashbin.model.ModelDatabase

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}