package chapter9


fun <T: Any> show(type: T) {
    val  constructor = type::class.constructors.firstOrNull()
    // you can check if a generic type is a list
    // but you will not obtain the information of that type
//    if (type is List<*>) {
//        println(type::class.simpleName)
//    }

    //you can ues type cast
    val lint = type as? List<Int> ?: throw ClassCastException("type is not a List<Int> type")
    println(lint.sum())
}
class Horse(val name: String)

fun main(args: Array<String>) {
    val l = listOf(1, 2, 3, 4)
//    val ls = l.slice(IntRange(1, 2))
//    println(ls)
    show(l)

    val ss = arrayOf("1", "2", "3")
    show(ss)
}