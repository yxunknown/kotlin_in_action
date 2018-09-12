package chapter10

import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

// define for function reference
fun isOdd(x: Int) = x % 2 == 0

// define for property reference
val x = 2
var y = 3
fun main(args: Array<String>) {
    //function reference
    val nums = 1..10
    // ::isOdd = (Int) -> Boolean
    println(nums.filter(::isOdd))
    // define function reference
    // ::isOdd return a KFunction<out R> object
    val predicate: (Int) -> Boolean = ::isOdd
    println(nums.filter(predicate))
    // predicate can be used as a normal function here
    println(predicate(3))

    // property reference
    // ::x return a KProperty<T> object
    println(::x.get())
    println(::x.name)
    println(y)
    ::y.set(4)
    println(y)

    reflects(Phone("ximi 8", "mi.com", 1999.0))
}

fun reflects(obj: Any) {
    val properties = obj::class.memberProperties
    properties.forEach {

    }
}