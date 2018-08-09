package chapter2

import java.io.BufferedReader
import java.io.StringReader

fun setPercentage(percentage: Int) {
    if (percentage in 0..100) {
        println("current progress is $percentage")
    } else throw IllegalArgumentException("the value should be 0 - 100: $percentage")
}
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun readNumerV2(reader: BufferedReader) {
    
}
fun main(args: Array<String>) {
//    try {
//        setPercentage(10)
//        setPercentage(102)
//        setPercentage(-3)
//    } catch (e: IllegalArgumentException) {
//        e.printStackTrace()
//    }
    val reader = BufferedReader(StringReader("2w39"))
    println(readNumber(reader))

}