package chapter4

//by default, abstract class is open to be extend
//abstract class is always open, can't be marked as final
abstract class Animal {
    //abstract method is open to be override by default
    abstract fun walk()
    //a method with default implement can't be override directly until use open mark
    open fun shout() = println("wu~~~ wu~~~ wu")
    //this function can't be override
    fun die() = println("Dead!")
}

class Cat: Animal() {
    override fun walk() = println("cat walk")

    override fun shout() = println("miao miao miao~~~")
}

class Hashiqi: Animal() {
    override fun walk() = println("pengda pengda pengda")
}

fun main(args: Array<String>) {
    val cat = Cat()
    cat.walk()
    cat.shout()
    cat.die()
    val  hashiqi = Hashiqi()
    hashiqi.walk()
    hashiqi.shout()
    hashiqi.die()
}