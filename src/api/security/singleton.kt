package api.security

class Retro {
    fun init(server: String, token: String) {
        println("server is $server and token is $token")
    }

    fun show() {
        println(this.hashCode())
    }
}

object Retrofit {
    private lateinit var retro: Retro
    private var isInitialized = false
    fun init(server: String, token: String) {
        if (!isInitialized) {
            retro = Retro()
            retro.init(server, token)
            isInitialized = true
        } else {
            println("the retrofit is initialized")
        }
    }

    fun use() {
        if (isInitialized) {
            retro.show()
        } else {
            println("retrofit must be init first")
        }
    }
}

fun main(args: Array<String>) {
//    Retrofit.init("aaa", "aaa")
//    Retrofit.init("aaa", "aaa")
//    Retrofit.use()
//    Retrofit.use()
    Retrofit.use()
}