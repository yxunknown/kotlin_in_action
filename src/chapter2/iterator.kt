package chapter2

// loop in kotlin

fun fizzbuzz(i: Int) = when {
    i % 15 == 0 -> "Fizz Buzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun isDigital(char: Char) = char in '0'..'9'

fun isLetter(char: Char) = char in 'a'..'z' || char in 'A'..'Z'

fun recogenize(char: Char) = when(char) {
    in 'a'..'z' -> "$char is a lowercase letter"
    in 'A'..'Z' -> "$char is a uppercase letter"
    in '0'..'9' -> "$char is a digital number"
    else -> "I don't know what $char is"
}

fun main(args: Array<String>) {
//    for (i in 1..100) {
//        println(fizzbuzz(i))
//    }
//    for (i in 100 downTo 1 step 2) {
//        println(fizzbuzz(i))
//    }
//    for (i in 1 until 100 step 2) {
//        println(fizzbuzz(i))
//    }

//    val charMap = TreeMap<Char, String>()
//    for (c in 'A'..'Z') {
//        charMap[c] = Integer.toBinaryString(c.toInt())
//    }
//
//    for ((char, string) in charMap) {
//        println("$char is $string in binary")
//    }
//
//    val list = arrayListOf("10", "101", "1001", "10011")
//    for ((index, element) in list.withIndex()) {
//        println("$index is $element")
//    }

//    println(isDigital('2'))
//    println(isDigital('a'))
//    println(isLetter('!'))
//    println(isLetter('a'))
//    println(isLetter('D'))

    println(recogenize('2'))
    println(recogenize('a'))
    println(recogenize('!'))
    println(recogenize('a'))
    println(recogenize('D'))
}

