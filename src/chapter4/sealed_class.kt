package chapter4

//sealed class means a super class can restrict its subclass, like number of subclasses
//sealed class is open by default
sealed class Expression {
    //sealed class has a private constructor
    //and there is no sealed interface
    //because interface can be implemented by java code
    //and private-constructor class can't be instanced
    //the constructor of sealed class only can call by inside class
    class Number(val value: Int): Expression()
    class Plus(val leftExpression: Expression, val rightExpression: Expression): Expression()
}

fun eval(expression: Expression): Int = when(expression) {
    //while use when expression to handle sealed class
    //there is no need to write a default branch
    is Expression.Number -> expression.value
    is Expression.Plus -> eval(expression.leftExpression) + eval(expression.rightExpression)
}

fun main(args: Array<String>) {
    println(eval(
            Expression.Plus(
                    Expression.Plus(Expression.Number(2), Expression.Number(4)),
                    Expression.Number(7)
                           )
                )
           )
}