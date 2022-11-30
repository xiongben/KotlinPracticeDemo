package com.xb.demo1

fun main() {
    val list = listOf("apple", "orange", "pear", "grape")
    if (list has "apple") {
        println("ppppp")
    }
    val map = mapOf("apple" with 1, "pear" with 2, "orange" with 3)
}

infix fun <T> Collection<T>.has(element: T) = contains(element)
infix fun <A,B> A.with(that:B): Pair<A,B> = Pair(this, that)
