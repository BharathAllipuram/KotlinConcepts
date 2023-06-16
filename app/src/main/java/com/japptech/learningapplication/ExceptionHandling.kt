package com.japptech.learningapplication

fun main(args: Array<String>) {
//    var num = 10 / 0     // throws exception
//    println(num)

    //using try catch
    println(test(10, 2)) //execute in try block
    println(test(10, 0))// execute in catch block

    println(calculateResult(2,3))
}

//Using try catch for exception handling
fun test(a: Int, b: Int): Any {
    return try {
        a / b
        //println("The Result is: "+ a / b)
    } catch (e: Exception) {
        println(e)
        "Divide by zero not allowed"
    }
}


inline fun calculateResult(a: Int, b: Int): Int {
    return a + b
}
