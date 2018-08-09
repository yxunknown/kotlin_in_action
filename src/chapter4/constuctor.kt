package chapter4

import chapter2.Color

//a simple class wit primary constructor
class Sky(val cloud: Color) {
    override fun toString(): String {
        return "it is a sky with $cloud cloud"
    }
}

//another complex way to write constructor
//but this code style can do some initialization code
class Skyz constructor(_cloud: Int) {
    val cloud: Int
    init {
        println("a Skyz instance is generated")
        cloud = _cloud
    }
}

//if the constructor of a class do nothing initialization
//the primary constructor can omit the constructor and init keyword
class OrangeCat(_weight: Double) {
    val weight = _weight
}

//if the classes which have no initialization work to do
//use the most lazy primary constructor style
class NoInitializationWorkToDoClass(val properties: Any)

fun main(args: Array<String>) {
    //get a sky instance with orange cloud
    //in kotlin, there is no need to use new to get an instance of a class
    val blueSky = Sky(cloud = Color.ORANGE)
    println(blueSky)

    val cloudySky = Skyz(_cloud = 10)
    println(cloudySky.cloud)

    val orangeCat = OrangeCat(14.0)
    println("an orange cat with weight at ${orangeCat.weight} JIN")

}

//multiple secondary constructor
class Context
open class Viewz {
    constructor(ctx: Context) {
        //instanced with context
    }
    constructor(ctx: Context, attr: Int) {
        //instanced with context and attr
    }
}

class ProgressBar: Viewz {
    constructor(ctx: Context): super(ctx) {
        //instance progressbar with context
    }

    constructor(ctx: Context, attr: Int): super(ctx, attr) {
        //instance progressbar with context and attr
    }
}

class Framelayout: Viewz {
    constructor(ctx: Context): this(ctx, 0)
    constructor(ctx: Context, attr: Int): super(ctx, attr) {
        //constructor use another constructor
    }
}


