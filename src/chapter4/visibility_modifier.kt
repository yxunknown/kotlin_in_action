package chapter4

//kotlin use public by default

internal open class Human {
    fun greet() = println("Hey!")
    private fun sing() = println("La la la suo xi xi suo re do")
    protected fun talk() = println("Talk is cheap")
}

//extension function can't access private and protected method or properties
private fun Human.groop() {
    greet()
}

fun main(args: Array<String>) {
    val h = Human()
    h.groop()
}