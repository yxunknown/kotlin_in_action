package chapter3

data class User(val id: Int, val name: String, val address: String)

//save user version 1
fun saveUser(user: User) {
    //validate user field
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty address")
    }
    //validate user ok
    //save to database
}

//save user version 2, use local function to reduce code duplication
fun saveUserV2(user: User) {
    fun validateUser(user: User, value: String, filedName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $filedName")
        }
    }
    validateUser(user, user.name, "Name")
    validateUser(user, user.address, "Address")

    //save to database
}

//save user version 3, local function can access the parameter from parent function
fun saveUserV3(user: User) {
    fun validateUser(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validateUser(user.name, "Name")
    validateUser(user.address, "Address")

    //save to database
}

//validate user use extension function
fun User.validateToSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

//save user version 4
fun saveUserV4(user: User) {
    user.validateToSave()
    //save to databases
}
fun main(args: Array<String>) {
    saveUserV3(User(2, "程飘", "南岸区"))

    val user = User(id = 3, name = "mevur", address = "as")

    saveUserV4(user)
}