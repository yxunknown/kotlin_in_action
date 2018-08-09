package chapter3

fun <T> joinToString(collection: Collection<T>,
                     separator: String,
                     prefix: String,
                     postfix: String): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        result.append(element)
        if (index < collection.size - 1) {
            result.append(separator)
        }
    }
    result.append(postfix)
    return result.toString()
}

//function with default value parameter
fun <T> joinToStringDefault(collection: Collection<T>,
                            separator: String = "; ",
                            prefix: String = "(",
                            postfix: String = ")"): String {
    return joinToString(collection, separator, prefix, postfix)
}

fun main(args: Array<String>) {
//    val map = hashMapOf("4" to 23, "ace" to 213)
    val list = listOf(1, 2, 3)
    val set = setOf(2, 4, 9)
    val array = listOf("2", "32", "332")
    println(joinToString(list, " $# ", "##[", "]##"))
    println(joinToString(collection = set, separator = ". ", prefix = "(", postfix = ")"))
    println(joinToStringDefault(array))
    println(joinToStringDefault(array, separator = ", "))
    println(joinToStringDefault(array, prefix = "k"))

}
