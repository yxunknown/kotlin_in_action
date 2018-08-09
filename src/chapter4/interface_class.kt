package chapter4

interface Clickable {
    fun click()
    // a method in interface can have default implement
    fun showOff() = println("i am clickable")
}

interface Focusable {
    fun setFocus(focus: Boolean) = println("${if (focus) "Got" else "lost"} focus")
    fun showOff() = println("i am focusable")
}

class Button: Clickable, Focusable {
    override fun click() = println("i am clicked")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
        println("i am a button")
    }
}

fun main(args: Array<String>) {
    Button().click()
    val btn = Button()
    btn.showOff()
    btn.setFocus(false)
}