package chapter3

fun main(args: Array<String>) {
    val strings: List<String> = listOf("kotlin", "java", "c++", "amazon")
    println(strings.last())
    println(strings.max())

    val numbers: Collection<Int> = setOf(1, 2, 4, 6, 9)
    println(numbers.max())

    showList(*args)
    showList("cs", strings, 2, 20.2f)
    showList("kotlin", "java", "c++")

    val list = listOf("args: ", *args)
    println(list)
}


//vararg function
fun <T> showList(vararg value: T) {
    for ((index, element) in value.withIndex()) {
        print("$index: $element ")
    }
    println()
}