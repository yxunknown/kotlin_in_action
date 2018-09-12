package chapter4

import java.util.*

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Order(val id: Int, val date:  Date) {
    companion object: JSONFactory<Order> {
        override fun fromJSON(jsonText: String): Order {
            return Order(1, Date())
        }
    }
}
fun <T> loadFromJson(factory: JSONFactory<T>, jsonText: String): T {
    return factory.fromJSON(jsonText)
}
fun main(args: Array<String>) {
    val order = Order.fromJSON("")
    println("id: ${order.id} date: ${order.date} ")

    //the name of Order class is used as an instance of JSONFactory
    val o = loadFromJson(Order, "")
    println("id: ${o.id} date: ${o.date} ")
}