package com.example.activitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlin.random.Random

class RecyclerViewDemoActivity : AppCompatActivity() {
    private val fruitsList = mutableListOf<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_demo)
        initFruits()
        val listView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        listView.layoutManager = layoutManager
        val adapter: FruitRecyclerAdapter = FruitRecyclerAdapter(fruitsList)
        listView.adapter = adapter
        println("============")
        println((1..20).random())
    }

    private fun initFruits() {
        repeat(10){
            fruitsList.add(Fruit(getRandomLengthName("apple"), R.drawable.apple_pic))
            fruitsList.add(Fruit(getRandomLengthName("banana"), R.drawable.banana_pic))
            fruitsList.add(Fruit(getRandomLengthName("orange"), R.drawable.orange_pic))
            fruitsList.add(Fruit(getRandomLengthName("watermelon"), R.drawable.watermelon_pic))
            fruitsList.add(Fruit(getRandomLengthName("Pear"), R.drawable.pear_pic))
            fruitsList.add(Fruit(getRandomLengthName("Grape"), R.drawable.grape_pic))
            fruitsList.add(Fruit(getRandomLengthName("Pineapple"), R.drawable.pineapple_pic))
            fruitsList.add(Fruit(getRandomLengthName("Strawberry"), R.drawable.strawberry_pic))
            fruitsList.add(Fruit(getRandomLengthName("Cherry"), R.drawable.cherry_pic))
            fruitsList.add(Fruit(getRandomLengthName("Mango"), R.drawable.mango_pic))
        }
    }

    private fun getRandomLengthName(name: String): String {
        val length = (10..20).random()
        println(length)
        val builder = StringBuilder()
        for (i in 0 until length) {
            builder.append(name)
        }
        return  builder.toString()
    }
}