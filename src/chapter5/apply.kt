package chapter5

//apply is an extension function on any Object
//it hold an instance of a Object and can use the methods of the instance
//then the apply function return the receiver instance at final
fun getalphabt(): String = StringBuilder().apply {
        for (ch in 'A'..'Z') {
            append(ch)
        }
        append("\n now i know the alphabet")
        }.toString()

fun main(args: Array<String>) {
    println(getalphabt())
}