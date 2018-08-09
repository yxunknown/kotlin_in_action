package chapter2

import chapter2.Color.*

enum class Color (val r: Int, val g: Int, val b: Int){
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rab() = (r * 256 + g) * 256 + b
}

fun getNameOfColor(color: Color) = when (color) {
    Color.BLUE -> "blue"
    Color.RED -> "red"
    Color.YELLOW -> "yellow"
    Color.ORANGE -> "orange"
    Color.GREEN -> "green"
    Color.INDIGO -> "indigo"
    Color.VIOLET -> "violet"
}
fun getWarmth(color: Color) = when (color) {
    Color.BLUE, Color.GREEN, Color.INDIGO, Color.VIOLET -> "cold"
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
}

fun mixColor(c1: Color, c2: Color) = when(setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(RED, GREEN) -> INDIGO
    setOf(ORANGE, GREEN) -> VIOLET
    else -> throw Exception("dirty color")
}

fun mixColorOpt(c1: Color, c2: Color) = when {
    (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED)
        -> ORANGE
    (c1 == RED && c2 == GREEN) || (c1 == GREEN && c2 == RED)
        -> INDIGO
    (c1 == ORANGE && c2 == GREEN) || (c1 == GREEN && c2 == ORANGE)
        -> VIOLET
    else -> throw Exception("dirty color")
}
fun main(args: Array<String>) {
    println(Color.BLUE.rab())
    println(getNameOfColor(Color.INDIGO))
    println(getNameOfColor(Color.INDIGO))
    println(getWarmth(Color.INDIGO))
    println(mixColor(RED, GREEN))
    println(mixColor(GREEN, RED))
    println(mixColorOpt(RED, GREEN))
    println(RED)
    val a = setOf(RED, GREEN, YELLOW)
    println(a)
    a.forEach { color -> println(color) }


}

