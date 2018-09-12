package chapter5

fun alphabet(): String {
    val sb = StringBuilder()
    for (ch in 'A'..'Z') {
        sb.append(ch)
    }
    sb.append("\nNow i know the alphabet")
    return sb.toString()
}

fun alphabetWithVerision(): String {
    val sb = StringBuilder()
    //with is a function which can hold two args
    //and the lambda expression is the second parameter
    return with(sb) {
        for (ch in 'A'..'Z') {
            append(ch)
        }
        append("\nNow i know the alphabet")
        this.toString()
    }
}

data class Cost(val price: Double, val date: String)

fun main(args: Array<String>) {
//    println(alphabetWithVerision())

    val costs = listOf(Cost(23.4, "2018-08-20"), Cost(212.4, "2018-08-20"),
            Cost(25.4, "2018-09-20"), Cost(221.23, "2018-08-20"),
            Cost(221.23, "2018-10-21"),
            Cost(221.23, "2018-08-22"))
    val list = costs.asSequence()
            .groupBy { it.date.substringBeforeLast("-") }
            .map { Cost(it.value.sumByDouble { it.price }, it.key) }
            .toList()
    println(list)
}