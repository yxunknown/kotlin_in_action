package chapter4

class Client(val name: String, val postal: Int) {
    override fun toString(): String {
        return """
            client(name: $name, postal: $postal)
        """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        return if (null == other || other !is Client) {
            // can be simplified to " other !is Client "
            false
        } else {
            name == other.name && postal == other.postal
        }
    }

    //if override the equals method
    //don't forget to override the hashCode method

    override fun hashCode() = name.hashCode() * 31 + postal
}

//fun main(args: Array<String>) {
//    val alice = Client("alice", 333402)
//    val aliceClone = Client("alice", 333402)
//
//    // == wile call the equal method to check
//    println(alice == aliceClone) // true
//    // === to compare the reference
//    println(alice === aliceClone) // false
//
//    val vipClients = hashSetOf(Client("alice", 333402))
//    println(vipClients.contains(Client("alice", 333402)))
//}
//

//data class will auto generated equals, toString, hashCode, copy method
//best practice:
//use val keyword to declaration properties of data class
//to make data class immutable
//if need to modify the data of data class instance
//use copy function to get an new instance
data class Vip(val name: String, val number: Int)

fun main(args: Array<String>) {
    val vips = hashSetOf(Vip("chengpiao", 21), Vip("mevur", 213))
    println(vips)   //check toString implementation
    val ok = vips.contains(Vip("chengpiao", 21))
    println(ok) //check hashCode and equals implementation
    vips.forEach { vip -> println(vip.hashCode()) }

    val aVip = vips.toList()[0].copy(number = 22)
    println(aVip)
}