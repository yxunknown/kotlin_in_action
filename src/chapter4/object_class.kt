package chapter4

import java.io.File

//object class
//declare a class and generate an instance
//generally speaking, the object is like the static method in java
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

/**
 * class
 *   private foo
 *   object                      //can call the foo
 *
 * fun xxx                         //top-level function, can't call the foo
 */

class School private constructor(val name: String){

    object SchoolFactory {
        fun getSchool(): School {
            // can't access the name
            return School("sdw")

        }
    }

    fun showName() {
        println(name)
        //can access the ShowSchool
    }
}

class Teacher {
    private val wife = "i am wife"

    fun ok() {}

    companion object {
        fun show() {
            println()

        }
    }

    fun showName() {
        show()
    }
}


//create different member with multiple constructor
class Member {
    val name: String
    constructor(email: String) {
        name = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        val facebookUser = FacebookUser(facebookAccountId.toString())
        name = facebookUser.getUserName(facebookUser.accountId)
    }
}

//create different member with factory method
//here, can use companion object to implement Factory Pattern
class MemberWithFactor private constructor(val name: String) {
    companion object {
        fun newMemberUser(email: String) =
                MemberWithFactor(email.substringBefore('@'))

        fun newMemberWithFacebook(id: Int): MemberWithFactor  {
            //the companion object can only access the constructor
            return MemberWithFactor(id.toString())
        }
    }

    private fun getName(id: Int): String {
        val facebookUser = FacebookUser(id.toString())
        return facebookUser.accountId
    }
}




fun main(args: Array<String>) {
//    println(Database.sqlExecutor)
//    Database.executeSQL("select * from table")
//    val f1 = File("/Users/chengpiao")
//    val f2 = File("/Users/chengpiao")
//
//    println(CaseInsensitiveComparator.compare(f1, f2))
    val school = School.SchoolFactory.getSchool()
    school.showName()
    //the ShowSchool object don't belong to school instance of School

    val teacher = Teacher()
    Teacher.show()


}
