package chapter11

fun buildString(builderAction: StringBuilder.() -> Unit): String {
//    val sb = StringBuilder()
//    sb.builderAction()
//    return sb.toString()
    return StringBuilder().apply{ builderAction() }.toString()
}

fun main(args: Array<String>) {
    val str = buildString {
        append("hello,")
        append("world")
    }
    println(str)
    val s = mutableMapOf(1 to "one")
    s.apply { this[2] = "two" }
    with(s) {
        this[3] = "three"
    }
    println(s)
}