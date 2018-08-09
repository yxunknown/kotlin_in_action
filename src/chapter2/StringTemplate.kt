package chapter2

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "kotlin"
    println("hello, $name!")
    println("hello, ${args[0].toUpperCase()}!")
    println("hello, ${if (args.isNotEmpty()) args[0] else "olly"}!")
}