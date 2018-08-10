package chapter4

//add visibility modifier to change the visibility of accessors
class LenghtCounter {
    var count: Int = 0
        private set

    fun addWord(word: String) {
        count += word.length
    }
}

fun main(args: Array<String>) {
    val l = LenghtCounter()
    l.addWord("hello world")
    println(l.count)

    l.addWord("chongqing city")
    println(l.count)
}