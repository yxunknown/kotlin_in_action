package chapter5

fun main(args: Array<String>) {
//    val strs = listOf("apple", "nokia", "tcl", "oracle", "jetbrains", "asus", "lenovo")
//    val str = strs.filter { it.first() < 'b' }
//    println(str)
//
//    val seq = strs.asSequence()
//            .filter { it.first() != 'a' }
//            .toList()
//    println(seq)

    //

//    val l = listOf(1, 2, 3, 4, 5)
//            .asSequence()
//            .map { println("map($it)")
//                it * it }
//            .filter { println("filter($it)")
//                      it % 2 == 0 }
//            .toList()
//    actions are performed on each element by order
    val s = listOf(1, 2, 3, 4, 5)
            .map { println("map($it)")
                it * it }
            .filter { println("filter($it)")
                it % 2 == 0 }
    //map all element of the list then do filter action

}