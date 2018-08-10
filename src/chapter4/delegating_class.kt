package chapter4

import java.util.*
import java.util.function.Consumer
import java.util.stream.Stream
import kotlin.collections.HashSet

//delegating class
class DelegatingCollection<T>: Collection<T> {
    private val innerList = arrayListOf<T>()
    override val size: Int
        get() = innerList.size

    override fun contains(element: T): Boolean = innerList.contains(element)

    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)

    override fun isEmpty(): Boolean = innerList.isEmpty()

    override fun iterator(): Iterator<T> = innerList.iterator()

    override fun parallelStream(): Stream<T> = innerList.parallelStream()

    override fun spliterator(): Spliterator<T> = innerList.spliterator()

    override fun stream(): Stream<T> = innerList.stream()

    override fun forEach(action: Consumer<in T>?) = innerList.forEach(action)
}

//you can use by keyword to simplified the code
//this means that you can appoint a property which is the subclass of the interface that
// you want to implement to implement the interface
//hence, here use innerList to delegate implementing the Collection<T> interface
class CustomCollection<T>(val innerList: Collection<T> = arrayListOf()): Collection<T> by innerList {
    //your other code here
    //in this way, you haven't changed the behavior of Collection<T>
    //but you can add additional properties or methods on Collection<T>
    //this is an implementation of Decorator Pattern(装饰器模式 in Chinese)
    //compiler will auto implement the method of Collection<T> in the way of DelegatingCollection<T> above
    //but you can override the method you want to change their behaviors
}

//count item that be added to a set
class CountSet<T>(val set: MutableCollection<T> = HashSet()): MutableCollection<T> by set {
    var countOfItem: Int = 0
        private set

    override fun add(element: T): Boolean {
        countOfItem++
        return set.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        countOfItem += elements.size
        return set.addAll(elements)
    }
}

fun main(args: Array<String>) {
    val set = CountSet<Int>()
    fun printCount() {
        println("count of items in set is ${set.countOfItem}")
    }
    printCount()
    set.add(2)
    printCount()
    set.addAll(setOf(1, 3, 5, 0))
    printCount()
}
