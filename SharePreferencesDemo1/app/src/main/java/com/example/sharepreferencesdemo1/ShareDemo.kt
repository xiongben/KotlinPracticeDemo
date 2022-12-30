package com.example.sharepreferencesdemo1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_share_demo.*

class ShareDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_demo)
        saveButton.setOnClickListener {
            getSharedPreferences("data", Context.MODE_PRIVATE).edit {
                putString("name","Tom")
                putInt("age", 19)
                putBoolean("married", false)
            }
        }

        restoreButton.setOnClickListener {
            val prefs = getSharedPreferences("data", Context.MODE_PRIVATE)
            val name = prefs.getString("name","")
            val age = prefs.getInt("age", 0)
            val married = prefs.getBoolean("married", false)
            Log.d("ShareDemo","name is $name")
            Log.d("ShareDemo","age is $age")
            Log.d("ShareDemo","married is $married")
        }
    }
}