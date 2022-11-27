package com.xb.demo1

fun main() {

}

sealed class Result
class Success(val msg: String) : Result()
class Failure(val error: Exception) : Result()

fun getResMsg(result: Result) = when(result) {
    is Success -> result.msg
    is Failure -> "error is ${result.error.message}"
}