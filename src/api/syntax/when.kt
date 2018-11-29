package api.syntax

fun main(args: Array<String>) {
    val x = 8
    when {
        x < 0 -> {
            println("negative")
        }
        x % 2 == 0 -> {
            println("even")
        }
        x % 4 == 0 -> {
            println("times of 4")
        }
        else -> {
            println("plain number")
        }
    }
}