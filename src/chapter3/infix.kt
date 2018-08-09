package chapter3

fun main(args: Array<String>) {
    val map = mapOf(1 to "one", 2 to "two", 4 to "four", "four" to 2, 5 to listOf(1, 2, 4))
    println(map)
    println((1 to "one").toList())
    val c = 1 add 2
    println(c)
    println(3.add(2))

    val pair = Pair(2, "four")
    println(pair)

    val (name, age) = "程飘" to 23
    println("$name is $age")
}


//infix function (中缀函数 in chinese)
infix fun <A: Int, B: Int> A.add(that: B): Int = this + that