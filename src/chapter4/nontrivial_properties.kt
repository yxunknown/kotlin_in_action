package chapter4

//in kotlin, an interface can hold abstract properties declaration

interface Account {
    val name: String
}

//user primary constructor
class PrivateUser(override val name: String): Account

class SubscribingUser(val email: String): Account {
    //here use custom getter
    override val name: String
        get() = email.substringBefore("@")
}

class FacebookUser(val accountId: String): Account {
    //override the define of name
    override val name = getUserName(accountId)

    fun getUserName(accountId: String): String {
        val name = ""
        //select the username from database
        return name
    }
}

//an interface contains getter and setter
interface Customer {
    //the property has no default getter
    //therefore the class implement this interface should provide a getter for it
    val email: String
    //the property has a default getter,
    // which can be inherited by the class implemented the interface
    val name: String
        get() = email.substringBefore("@")
}

//access back field from it's accessors
//field is where to store the value of o property
class Student(val name: String) {
    var address: String = "unspecified"
        set(value) {
            println("""
                address was changed for $name:
                "$field" -> "$value" //read the back field
                """.trimIndent())
            //what is $filed mean for
            //the field is a special identifier to access the backing field
            //in a getter, you can only read it
            //but in a setter, you can read or change it
            field = value //change the back field
//            address = value // produce a recursive call
        }

    override fun toString(): String {
        return """
            student: {name: $name, address: $address}
        """.trimIndent()
    }
}

fun main(args: Array<String>) {
    val student = Student("程飘")
    println(student)
    student.address = "Nanan district, Chongqing city"
    println(student)

}