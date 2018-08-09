package chapter2

import java.util.*

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() = width == height
}


fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}


fun main(args: Array<String>) {
    val rectangle = createRandomRectangle();
    println(rectangle.isSquare)
}