package com.xb.demo1

import kotlin.reflect.KProperty

fun main() {
    val set1 = hashSetOf<String>("dd", "gg", "re", "tt")
    val myset = Myset(set1)
    myset.helloWorld()
    println(myset.contains("dd"))
    val p by later {
        println("uuuuu")
        "test late"
    }
    println(p)
}

class Myset<T>(val helperSet: HashSet<T>) : Set<T> by helperSet {
    fun helloWorld() = println("hello world")
    override fun isEmpty(): Boolean {
        return false
    }
}

class Later<T>(val block: () -> T) {
    var value: Any? = null
    operator fun getValue(any: Any?, prop: KProperty<*>): T {
        if (value == null) {
            value = block()
        }
        return value as T
    }
}

fun <T> later(block: () -> T) = Later(block)

