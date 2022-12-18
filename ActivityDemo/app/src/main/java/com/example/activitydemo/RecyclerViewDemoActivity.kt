package com.example.activitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewDemoActivity : AppCompatActivity() {
    private val fruitsList = mutableListOf<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_demo)
        initFruits()
        val listView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        listView.layoutManager = layoutManager
        val adapter: FruitRecyclerAdapter = FruitRecyclerAdapter(fruitsList)
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