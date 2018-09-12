package chapter6

fun validateString(string: String?) {
    if (string.isNullOrBlank()) {
        println("plz fill in the blank")
    }
}

fun main(args: Array<String>) {
    validateString("sd")
    validateString(null)
    validateString("")
    validateString(" ")
}