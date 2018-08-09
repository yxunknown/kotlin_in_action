package chapter3

fun createCollection() {
    //a normal set, element wont repeat in a set
    val set = setOf(1, 7, 53, 1, 7, 53)
    //a list
    val list = arrayListOf(1, 7, 53, 1, 7, 53)
    //a <Int,String> map, key-value pairs
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set)
    println(list)
    println(map)

    println(set.max())
}

fun main(args: Array<String>) {
    createCollection()
}