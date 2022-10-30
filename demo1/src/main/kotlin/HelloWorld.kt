fun main() {
    println("hello,xb")
    val list: List<Int> = asList(1,2,3)
    println(list)
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for(t in ts)
        result.add(t)
    return result
}

