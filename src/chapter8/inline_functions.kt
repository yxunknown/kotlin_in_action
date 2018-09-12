package chapter8

import java.util.concurrent.locks.Lock

//inline function will inject the function logic into where the function is called
inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun foo(lock: Lock) {
    println("before sync")
    synchronized(lock) {
        println("action")
    }
    println("after sync")
}

fun findAEven(nums: List<Int>) {
    val a = nums.forEach {
        if (it % 2 == 0) {
            println("$it is an Even")
            return@forEach
        }
    }

}

fun main(args: Array<String>) {
    val nums = listOf(1, 3, 5, 7, 9)
    findAEven(nums)

    val num = listOf(1, 3, 6, 7, 9)
    findAEven(num)
}