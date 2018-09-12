package chapter6

fun sendMail(mail: String) {
    println("Send mail to $mail")
}

fun main(args: Array<String>) {
    val s: String? = "das"
    s?.let { sendMail(it) }
    val a: String? = null
    a?.let { sendMail(it) }
}