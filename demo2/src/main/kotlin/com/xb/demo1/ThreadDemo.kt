package com.xb.demo1

import kotlinx.coroutines.*


fun main() {
//    println("start")
//    GlobalScope.launch { // 在后台启动一个新的协程并继续
//        delay(1000L) // 非阻塞的等待 1 秒钟（默认时间单位是毫秒）
//        println("World!") // 在延迟后打印输出
//    }
//    println("Hello,") // 协程已在等待时主线程还在继续
//    Thread.sleep(2000L) // 阻塞主线程 2 秒钟来保证 JVM 存活

    runBlocking {
        println("11111111")
        delay(1500)
        println("222222222")
        printDot()
        printDot2()
    }

}

suspend fun printDot() {
    println(".")
    delay(1000)
}

suspend fun printDot2() = coroutineScope {
    launch {
        println("==")
        delay(1000)
    }
}