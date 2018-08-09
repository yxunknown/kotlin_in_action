package chapter2

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun min(a: Int, b: Int) = if (a < b) a else b

fun main(args: Array<String>) {
    println(max(1, 2))
    println(min(1, 2))

}