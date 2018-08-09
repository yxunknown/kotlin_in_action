package chapter4

import java.io.Serializable

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State)
}

class Lable: View {
    override fun getCurrentState(): State {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun restoreState(state: State) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //this inner class is static by default
    //this class can't holder a reference of outer class
    class LableState: State {
        fun getState() {
            //can't access methods or properties of it outer class
        }
    }

    //this inner class is inner
    //so it has reference of outer class
    inner class LableStateInner: State{
        fun getState() {
            //reference from outer class
            this@Lable.getCurrentState()
            this@Lable.restoreState(this)
        }
    }
}