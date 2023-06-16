package com.japptech.learningapplication.functions


/*
    EXAMPLE ONE

*   1. Lambda Expression
*   2. Higher-Order Function
* */

fun main() {

    val program = Program()

    // Simple way... for better understanding
//    program.addTwoNumbers(2, 7)

    // Using Interface / OOPs way
    program.addTwoNumbers(2, 7, object : MyInterface {
        override fun execute(sum: Int) {
            println(sum)    // Body
        }
    })

     // Lambda Expression [ Function ]
     val myLambda: (Int) -> Unit = { s: Int -> println(s)}
     program.addTwoNumbers(2, 7, myLambda)

    //Function returning another function.
    val addByFive = program.addBy(5)
    val result1 = addByFive(10)
    println(result1) // Output: 15

    val addByTen = program.addBy(10)
    val result2 = addByTen(7)
    println(result2) // Output: 17
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {  // High Level Function with Lambda as Parameter
        val sum = a + b
        action(sum)     // println(sum)
//        println(sum)  // Body
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {    // Using Interface / Object Oriented Way
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) {                         // Simple way.. Just for Better Understanding
        val sum =  a + b
        println(sum)
    }

    // HOF returning function
    fun addBy(b: Int): (Int) -> Int {
        val myLambdaFunction: (Int) -> Int = { a: Int -> a + b }
        return myLambdaFunction

        //or
//        return { a: Int -> a + b }
    }
}

interface MyInterface {
    fun execute(sum: Int)
}