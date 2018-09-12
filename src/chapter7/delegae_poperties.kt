package chapter7

data class Email(val from: String,
                 val to: String,
                 val message: String)

val emails = listOf(Email("abc@qq.com", "bcf@aa.com", "hhhhwd"),
        Email("abc@qq.com", "bcf@aa.com", "2131"),
        Email("sac@qq.com", "abc@aa.com", "a1231"),
        Email("bcf@qq.com", "sac@aa.com", "wqewq"))

fun loadEmails(person: String): List<Email> {
    println("Load emails for $person")
    return emails.filter { it.to == person }
}
//implement lazy initialization using backing property technique,
//but this method is not thread-safe
class Man(val name: String) {
    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this.name)
            }
            return _emails!!
        }
}

//implement lazy initialization using a delegated property
class Woman(val name: String) {
    val emails by lazy { loadEmails(name) }
}

fun main(args: Array<String>) {
//    val m = Man("bcf@aa.com")
//    println(m.emails)
//    println(m.emails)
    val women = Woman("abc@aa.com")
    println(women.emails)
    println(women.emails)
}