package api.security

import java.time.Instant
import java.util.*

object ago

infix fun Int.days(x: ago): Date {
    val now = Instant.now()
    val yesterday = Instant.ofEpochMilli(now.toEpochMilli() - 1000 * 60 * 60 * 24 * this)
    return Date(yesterday.toEpochMilli())
}

fun main(args: Array<String>) {

    val now = Date()
    val yesterday = 1 days ago
    val beforeYesterday = 2.days(ago)
    val threeDaysAgo = 3 days ago

    println(now)
    println(yesterday)
    println(beforeYesterday)
    println(threeDaysAgo)
}