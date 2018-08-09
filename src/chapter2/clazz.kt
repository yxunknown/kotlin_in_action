package chapter2


//this class is called value objects
//which means the class contains only filed but no other code
data class Person(
        val name: String, // have getter, read-only
        var age: Int // have both getter and setter, writable
)

fun main(args: Array<String>) {
    val person = Person("程飘", 23)
    println("${person.name} is ${person.age} now")
    println("after a year")
    person.age += 1
    println("${person.name} is ${person.age} now".toUpperCase())
    println("${person.name} want to change a new name")
    println("but failed")

}