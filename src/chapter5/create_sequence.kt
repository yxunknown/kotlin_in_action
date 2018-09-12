package chapter5

fun main(args: Array<String>) {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numberTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numberTo100.sum())
}