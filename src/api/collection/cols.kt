package api.collection

data class Card(val date: String, val content: String)
data class Sd(val key: String, val cards: List<Card>)

fun main(args: Array<String>) {
    val cards = listOf(Card("2018-11-10 13:23:33", "sda"), Card("2018-11-10 13:13:33", "adfsad"))
    var cs = cards.groupBy { it.date.substringBeforeLast(" ") }
            .map { Sd(it.key, it.value) }
            .toList()
    println(cs)
}