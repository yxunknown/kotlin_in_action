package chapter9

//try to use type parameter
//fun <T> checkType(value: Any): Boolean = value is T
//the above function will get an error which says can't check type for instance of erased type

//use reified type
//the information of generic type T will not be erased
inline fun <reified T> checkType(value: Any): Boolean = value is T

fun main(args: Array<String>) {
//    println(checkType<Int>("dddd"))

    val l = listOf("1", "3", 2, "2", true, false, "true")
    println(l.filterIsInstance<String>())
}
