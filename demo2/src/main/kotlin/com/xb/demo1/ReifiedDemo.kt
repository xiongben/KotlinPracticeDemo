package com.xb.demo1

fun main() {
    val res1 = getGenericType<String>()
    val res2 = getGenericType<Int>()
    println(res1)
    println(res2)
}

inline fun <reified T> getGenericType() = T::class.java

// 协变和逆变

class SimpleData<out T>(val data: T?) {
    fun get(): T? {
        return data
    }
}