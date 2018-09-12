package chapter6

class ShowName {
    lateinit var name: String

    fun setUpName(name: String) {
        this.name = name
    }

    fun showName() {
        println("name is $name")
    }
}

fun main(args: Array<String>) {
    val showName = ShowName()
//    showName.setUpName("chengpiao")
    showName.showName()
}