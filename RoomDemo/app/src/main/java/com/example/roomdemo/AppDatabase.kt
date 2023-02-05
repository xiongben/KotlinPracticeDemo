package com.example.roomdemo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 3, entities = [User::class, Book::class])
abstract class AppDatabase: RoomDatabase() {
}