package chapter2

import java.io.BufferedReader
import java.io.StringReader

//fun readNumber(reader: BufferedReader) {
//    //here try catch as an expression
//    val number = try {
//        Integer.parseInt(reader.readLine())
//    } catch (e: NumberFormatException) {
//        println(e.message)
//        //function here with a return
//        return
//    }
//    println(number)
//}

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        //return a value
        //when any exception occurs in the try block
        null
    }
    println(number)
}

fun main(args: Array<String>) {
    val reader1 = BufferedReader(StringReader("not a number"))
    val reader2 = BufferedReader(StringReader("3332513"))
    readNumber(reader1)
    readNumber(reader2)
}