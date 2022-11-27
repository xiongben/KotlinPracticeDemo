package com.xb.demo1

import java.lang.StringBuilder

fun main() {
//    withFn()
//    runFn()
    Utils.doAction2()
}

fun withFn() {
    val list = listOf("apple", "banana", "orange")
    val res = with(StringBuilder()) {
        append("star eat:\n")
        for (s in list) {
            append(s).append("\n")
        }
        append("end it!")
    }
    println(res)
}

fun runFn() {
    val list = listOf("apple", "banana", "orange")
    val res = StringBuilder().run {
        append("star eat:\n")
        for (s in list) {
            append(s).append("\n")
        }
        append("end it!")
    }
    println(res)
}

class Utils {
    fun doAction1() {
        println("do action1!==")
    }

    companion object {
        fun doAction2() {
            println("do action2!===")
        }
    }
}