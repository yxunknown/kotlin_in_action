package chapter8

//higher order function is a function that can take
//other function as parameters or use a function as
//return type

fun handleTowInt(operation: (x: Int, y: Int) -> Int) {
    val result = operation(2, 3)
    println("the result is $result")
}

fun String.filter(predicate: (char: Char) -> Boolean): String {
    val sb = StringBuilder()
    for (ch in this.toCharArray()) {
        if (predicate(ch)) {
            sb.append(ch)
        }
    }
    return sb.toString()

}

fun main(args: Array<String>) {
//    handleTowInt { x, y -> x + y }
//    handleTowInt { x, y -> x - y }
//    handleTowInt { x, y -> x * y }
    val str = "China is the champion of lol demonstration contest of 2018"
    val s = str.filter { it in 'a'..'f'}
    println(s)
}