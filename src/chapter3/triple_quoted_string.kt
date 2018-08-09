package chapter3

fun main(args: Array<String>) {
    //triple quoted string
    //also called multiline string
    val a = """
        |         a
        |        a a
        |       aaaaa
        |      a     a
        |     a       a
    """.trimMargin()

    val windowsStylePathInKotlin = """c:\windows\system"""
    val windowsPathOldStyle = "c:\\windows\\system"

    val appleIphone = 599.99

    //use $ character in triple quoted string
    val priceInMultilineString = """apple iphone is ${'$'}$appleIphone"""
    val priceInString = "apple iphone is \$$appleIphone"

    println(a)

    println(windowsStylePathInKotlin)
    println(windowsPathOldStyle)

    println(priceInMultilineString)
    println(priceInString)

}