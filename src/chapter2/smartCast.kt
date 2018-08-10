package chapter2

interface Expr

// the Num class implements the Expr interface
class Num(val value: Int) : Expr

class Sum(val leftExpr: Expr, val rightExpr: Expr) : Expr


fun eval(expr: Expr): Int = when(expr) {
    is Num -> expr.value
    is Sum -> eval(expr.leftExpr) + eval(expr.rightExpr)
    else -> throw IllegalArgumentException("unknown expression.")
}

fun evalWithLogging(expr: Expr): Int = when(expr) {
    is Num -> {
        println("Num ${expr.value}")
        expr.value
    }
    is Sum -> {
        val left = evalWithLogging(expr.leftExpr)
        val right = evalWithLogging(expr.rightExpr)
        println("Sum $left + $right")
        left + right //the last expression in the block is the result
    }
    else -> throw IllegalArgumentException("unknown expression.")
}

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}