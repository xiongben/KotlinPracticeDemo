package com.xb.demo1

import java.lang.StringBuilder

fun main() {
    val list = listOf("apple", "banana", "orange")
    val res = StringBuilder().build {
        append("star eat:\n")
        for (s in list) {
            append(s).append("\n")
        }
        append("end it!")
    }
    println(res)
}

fun StringBuilder.build(block: StringBuilder.() -> Unit): StringBuilder {
    block()
    return this
}

public inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}