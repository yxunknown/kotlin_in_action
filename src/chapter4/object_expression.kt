package chapter4

interface ClickListener {
    fun click()
    fun show()
}

class Text {
    private var clickListener: ClickListener? = null

    fun addClickListener(clickListener: ClickListener) {
        this.clickListener = clickListener
    }

    fun click() {
        clickListener?.show()
        clickListener?.click()
    }
}

fun main(args: Array<String>) {
    val text = Text()

//    text.addClickListener(object : ClickListener {
//        override fun click() {
//           println("clicked !")
//        }
//
//        override fun show() {
//            println("showing")
//        }
//    })
    val clickListener = object : ClickListener {
        override fun click() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun show() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

    text.click()
}