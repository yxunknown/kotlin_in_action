package chapter11

open class Tag

fun createHtml(): Html = Html()

class Html: Tag() {
    fun table(action: Table.() -> Unit) {}
}

class Table: Tag() {
    fun tr(action: Tr.() -> Unit) {

    }
}

class Tr: Tag() {
    fun td(action: Td.() -> Unit) {

    }
}

class Td: Tag()

fun main(args: Array<String>) {
    val s = createHtml().table {
        tr {
            td {

            }
        }
    }
}