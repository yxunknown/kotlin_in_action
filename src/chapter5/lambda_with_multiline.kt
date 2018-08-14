package chapter5

fun main(args: Array<String>) {
    val sum = {x: Int, y: Int ->
        println("computing $x + $y .")
        //the last expression is the result
        x + y
    }

    println(sum(2, 3))
}