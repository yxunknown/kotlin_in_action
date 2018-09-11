package chapter9

//fun <out T> show(value: T) {
//    println(value)
//}

interface Transform<T> {
    fun transform(t: T /*in position*/): T /*out position*/
}

// if use out keyword on a type parameter on class
// this means the methods of class only can use type parameter as return type

class Name<out T : CharSequence> {
    //    fun produce(): T {
//        this fun is okay
//    }
//    fun show(t: T) {
//        this fun is error
//    }
}