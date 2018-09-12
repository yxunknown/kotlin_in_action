package chapter9

import java.util.*


//consume
fun listString(list: Collection<Any>) {
    println(list.joinToString(separator = " ", prefix = "{", postfix = "}"))
}

//edit

fun addElement(list: MutableCollection<Any>) {
    list.add(Date())
    // the element add into the list is cast to T
    println(list)
}

fun main(args: Array<String>) {
    val l = listOf("kotlin", "is", "based", "on", "java")
    listString(l)
    val ml = mutableListOf(2, 3, 4)
    //compile will be accepted
    addElement(ml.toMutableList())
}