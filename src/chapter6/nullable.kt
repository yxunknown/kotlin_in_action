package chapter6

//?: means if ( object != null) object else "what you want"
fun getLen(str: String?): Int = str?.length ?: 0

fun printIfString(o: Any?) {
    //as? check the type of an instance
    //?: when former check is false, do something here
    val str = o as? String ?: println("$o is not a string")
    //after as? check, the object has been casted to what the type you actually want
    println(str)
}

fun main(args: Array<String>) {
    println(getLen("dwwad"))
    println(getLen(null))
    printIfString(2)
    printIfString("32asda")
}