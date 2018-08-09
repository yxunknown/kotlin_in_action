package chapter3

//extension function
//means override in java
fun String.last(): Char = '2'



//add joinToString method to a collection
fun <T> Collection<T>.joinToString(separator: String = ", ",
                                   prefix: String = "(",
                                   postfix: String = ")"): String {
    val result = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        result.append(element)
        if (index < size - 1) {
            result.append(separator)
        }
    }
    result.append(postfix)
    return result.toString()
}
