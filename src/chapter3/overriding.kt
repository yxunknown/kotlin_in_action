package chapter3

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    //a subclass's override method will be used if a subclass instance be assigned to a parent class
    override fun click() = println("button clicked")
}
//extension function
//extension function wouldn't be used when a subclass instance assigned to a parent class instance
fun View.showOff() = println("I am a view")
fun Button.showOff() = println("I am a button")

fun main(args: Array<String>) {
    val view = View()
    view.click()

    val button = Button()
    button.click()

    val btn: View = Button()
    btn.click()

    view.showOff()

    button.showOff()

    btn.showOff()
}