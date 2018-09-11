package chapter10

import kotlin.reflect.full.memberProperties

@JsonKey(key = "phone")
data class Phone(@JsonKey(key = "name") val name: String,
                 @JsonKey(key = "vendor") val vendor: String,
                 @JsonExclude val price: Double)

@Target(AnnotationTarget.CLASS, AnnotationTarget.FIELD)
annotation class JsonKey(val key: String)

@Target(AnnotationTarget.FIELD)
annotation class JsonExclude

fun main(args: Array<String>) {
    val apple = Phone("iphone", "apple", 599.0)
    reflect(apple)
}

fun reflect(obj: Any) {
    val kclass = obj.javaClass.kotlin
    val fields = kclass.memberProperties
    val s = fields.joinToString(separator = ",", prefix = "{", postfix = "}") {
        "\"${it.name}\": \"${it.get(obj)}\""
    }
    println(s)
}