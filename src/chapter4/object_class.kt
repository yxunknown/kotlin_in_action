package chapter4

import java.io.File

//object class
//declare a class and generate an instance
//3 usage
//1. singleton
//2. the class which use class name to access method or properties
//3. anonymous inner class

//singleton
//object class can't have any constructor
object Database{
    val sqlExecutor: String = "i am your database"
    fun executeSQL(sql: String) {
        //handle the sql
        println(sql)
    }
}

object CaseInsensitiveComparator: Comparator<File> {
    override fun compare(o1: File?, o2: File?): Int = when {
        (o1 == null) -> -1
        (o2 == null) -> 1
        else -> o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

fun main(args: Array<String>) {
    println(Database.sqlExecutor)
    Database.executeSQL("select * from table")
    val f1 = File("/Users/chengpiao")
    val f2 = File("/Users/chengpiao")

    println(CaseInsensitiveComparator.compare(f1, f2))
}
