package chapter5



data class Star(val name: String, val count: Int)

fun findOldestPerson(stars: List<Star>) {
    var maxCount = 0
    var mostOne: Star? = null
    for (star in stars) {
        if (star.count > maxCount) {
            maxCount = star.count
            mostOne = star
        }
    }
    println(mostOne)
}

fun main(args: Array<String>) {
    val stars = listOf(Star("earth", 2), Star("mars", 0), Star("solar", 9))
    findOldestPerson(stars)
    println(stars.maxBy { it.count })
    //store a lambda expression in a variable
    val sum = {x: Int, y: Int -> x + y}
    println(sum(2, 4))
    //call lambda expression directly
//    { println("lambda expression called") } ()
    // run is a function to execute the lambda expression
    run { println("a run function") }

    //structure of lambda expression
    //{ lambda arguments -> return value}
    //if the lambda expression is the only argument for a function, then the () can be omitted
    val star = stars.maxBy {s: Star -> s.count}
    println(star)

    //transform = {s: Star -> s.name} can be replaced with transform = {it.name}
//    val names = stars.joinToString(separator = " ", transform = {s: Star -> s.name})
    //if there is only one parameter in lambda, the default name of arg is it`
    val names = stars.joinToString(separator = " ", transform = {s -> s.name})
    println(names)
}