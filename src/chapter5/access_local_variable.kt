package chapter5

fun printMessage(messages: List<String>, prefix: String) {
    messages.forEach { msg -> println("$prefix $msg") }
}


//in kotlin, allow you access non-final variable thus you can modify these variable
//however in java, you can only access final variable in lambda
fun countErrorMessage(messages: List<String>) {
    var clientError = 0
    var serverError = 0
    messages.forEach { msg ->
        if (msg.startsWith("4")) {
            clientError++
        } else if (msg.startsWith("5")) {
            serverError++
        }
    }

    println("$clientError client errors and $serverError server errors")
}

fun main(args: Array<String>) {
    val messages = listOf("404 not found", "500 internal error", "401 not authorized", "502 bad gateway")
//    printMessage(messages, "error")
    countErrorMessage(messages)
}