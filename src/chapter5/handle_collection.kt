package chapter5

import chapter2.Person

fun main(args: Array<String>) {
    val list = listOf(1, 2, 4, 5, 12)

    //filter can select the element you want
    println(list.filter { it % 2 == 0 })
    val peoples = listOf(Person("cheng", 34),
            Person("mevur", 23),
            Person("hercat", 25),
            Person("piao", 31))
    println(peoples.filter { it.age > 30 })
    println(peoples.count { it.age > 30 })

    //map can transform an old list to a new list as your wish
    println(peoples.map { person -> Person(person.name, person.age + 1) })
}