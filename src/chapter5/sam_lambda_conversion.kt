package chapter5

//SAM Constructor
fun createRunnable(): Runnable {
    //SAM Constructor
    return Runnable { println("i am runnable") }
}

fun main(args: Array<String>) {
    createRunnable().run()
}