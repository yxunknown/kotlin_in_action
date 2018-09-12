package chapter4

class Per(val firstName: String, val lastName: String) {
    //default name is Companion
    companion object {
        fun sayHello() = println("hello")
    }
    //a class can hold only one companion object
}

//companion object extension
fun Per.Companion.show() = println("show")

fun main(args: Array<String>) {
    Per.sayHello()
    Per.show()
}