package com.example.activitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListDemoActivity : AppCompatActivity() {

    private val listData = listOf<String>("apple","banner","pear","cherry","orange","watermelon","pear","grape","mango","pineapple")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_demo)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listData)
        val listView: ListView = findViewById(R.id.listView)
        listView.adapter = adapter
    }
}