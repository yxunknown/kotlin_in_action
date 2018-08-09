package chapter4

// by default, the class can't be extended
// and it's method can't be override by it's subclass
// if you need to change the default, use open keyword

open class A {
    open fun show() = println("I am an instance of A")
    open fun yes() = println("A say yes")
}

open class B: A() {
    //here the yes function can be override by subclasses of B
    override fun yes() = println("B say yes")
    //here the show function can't be override by subclass of B
    final override fun show() = println("i am an instance of B")
}
class C: B() {
    override fun yes() = println("C say yes")
}

fun main(args: Array<String>) {
    val b = B()
    b.show()
    b.yes()

    val a = A()
    a.show()
    a.yes()

    val ac: A = C()
    ac.yes()
    ac.show()

    val c = C()
    c.yes()
}