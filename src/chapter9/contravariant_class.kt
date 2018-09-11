package chapter9

interface Comparator<in T> {
    fun compare(e1: T, e2: T): Int
}