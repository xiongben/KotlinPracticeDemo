package com.xb.demo1

class ListDemo {
}

fun main() {
    val list = listOf("apple", "banana", "orange", "pear")
//    for (fruit in list) {
//        println(fruit)
//    }

//    val maxLengthFruit = list.maxByOrNull { fruit -> fruit.length }
    val maxLengthFruit = list.maxByOrNull { it.length }
    println(maxLengthFruit)

    val list2 = mutableListOf<String>("apple", "banana")
    list2.add("watermelon")
    println(list2)

    val map = HashMap<String, Int>()
    map["apple"] = 1
    map["banana"] = 2
    map["orange"] = 3
    println(map)

    val set = mutableSetOf("apple", "orange")
    set.add("banana")
    println(set)


}