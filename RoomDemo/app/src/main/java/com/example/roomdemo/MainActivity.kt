package com.example.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)

//        val userDao = AppDatabase.getDatabase(this).userDao()
//        val user1 = User("Tom", "Brady", 40)
//        val user2 = User("Tom","Hanks", 63)

//        addDataBtn.setOnClickListener {
//            thread {
//                user1.id = userDao.insertUser(user1)
//                user2.id = userDao.insertUser(user2)
//            }
//        }
//
//        updateDataBtn.setOnClickListener {
//            thread {
//                user1.age = 42
//                userDao.updateUser(user1)
//            }
//        }
//
//        deleteDataBtn.setOnClickListener {
//            thread {
//                userDao.deleteUserByLastName("Hanks")
//            }
//        }
//
//        queryDataBtn.setOnClickListener {
//            thread {
//                for (user in userDao.loadAllUsers()) {
//                    Log.d("MainActivity", user.toString())
//                }
//            }
//        }
    }
}