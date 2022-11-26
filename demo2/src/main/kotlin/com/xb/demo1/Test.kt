package com.xb.demo1

fun main() {
    val p = Person()
    p.name = "jack"
    p.eat()
}

interface Study {
    fun readBooks()
    fun doHomework()
}

open class Person {
    var name = ""
    var age = 10

    fun eat() {
        println(name + " is eating,he is " + age + "years old.")
    }
}

class Student : Person(), Study {
    var sno = ""
    var grade = 0

    override fun readBooks() {
        println("===read books =====")
    }

    override fun doHomework() {
        println("====do homework====")
    }
}