package chapter6

fun <T> printHashCode(t: T) {
    println(t?.hashCode() ?: "wocao")
}

//non-null type parameter

fun <T: Any>showHashCode(t: T) {
    //t is not null anyway
    println(t.hashCode())
}
fun main(args: Array<String>) {
    printHashCode("23")
    printHashCode(null)

    showHashCode("21")
//    showHashCode(null)
}