package chapter8

fun getFun(int: Int): (Int) -> Unit {
    return { i: Int -> println(int * i + i) }
}

fun main(args: Array<String>) {
    val x = getFun(2)
    x(3)
}

private fun show() {
    println("show")
}