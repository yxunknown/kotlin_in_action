package chapter3


//extension property
//String cant have a var type extension property
//because String is immutable
val String.lastChar: Char
    get() = get(length - 1)

//but a StringBuilder can hold a var type extension property
//because StringBuilder is mutable
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        setCharAt(length - 1, value)
    }


fun main(args: Array<String>) {
    println("abcd".lastChar)
    val sb = StringBuilder("acs")
    println(sb.lastChar)
    sb.lastChar = 'd'
    println(sb.lastChar)
}