package com.example.activitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListDemoActivity : AppCompatActivity() {

    private val listData = listOf<String>("apple","banner","pear","cherry","orange","watermelon","pear","grape","mango","pineapple")
    private val fruitsList = mutableListOf<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_demo)
        initFruits()
        val adapter = FruitAdapter(this, R.layout.fruit_item, fruitsList)
//        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listData)
        val listView: ListView = findViewById(R.id.listView)
        listView.adapter = adapter
    }

    private fun initFruits() {
        repeat(10){
            fruitsList.add(Fruit("apple", R.drawable.apple_pic))
            fruitsList.add(Fruit("banana", R.drawable.banana_pic))
            fruitsList.add(Fruit("orange", R.drawable.orange_pic))
            fruitsList.add(Fruit("watermelon", R.drawable.watermelon_pic))
            fruitsList.add(Fruit("Pear", R.drawable.pear_pic))
            fruitsList.add(Fruit("Grape", R.drawable.grape_pic))
            fruitsList.add(Fruit("Pineapple", R.drawable.pineapple_pic))
            fruitsList.add(Fruit("Strawberry", R.drawable.strawberry_pic))
            fruitsList.add(Fruit("Cherry", R.drawable.cherry_pic))
            fruitsList.add(Fruit("Mango", R.drawable.mango_pic))
        }
    }
}