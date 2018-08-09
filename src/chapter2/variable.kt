package chapter2

fun test(a: Int): String {
    val message: String
    if (a % 2 == 0) {
        message = "$a is an olden"
    } else {
        message = "$a is an even"
    }
    return message
}

fun main(args: Array<String>) {
    println(test(3))
}