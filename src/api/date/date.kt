package api.date

import java.util.*

fun main(args: Array<String>) {
    val currentDate = Date()
    val thisYear = Date(currentDate.year, 0, 1, 0, 0, 0)
    val nextYear = Date(currentDate.year + 1, 0, 1, 0, 0, 0)
    val cc = Calendar.getInstance()
    println(cc.get(Calendar.YEAR))
}