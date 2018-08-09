package chapter2

fun main(args: Array<String>) {
    val rectangle = createRandomRectangle()
    println("the rectangle has width: ${rectangle.width}, height: ${rectangle.height}")
    println("and is ${if (rectangle.isSquare) "" else "not"} a square")
}