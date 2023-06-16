package com.japptech.learningapplication.classes

fun main() {

    // Here declaring Test1 as class
    // Creating instance of the class which creates two objects => more memory consumption

    println(Test1().toString())
    println(Test1().toString())

    // Here declaring Test as Singleton class(referred as object)
    // Creating instance of the which creates only one object => less memory consumption
    println(Test.toString())
    println(Test.toString())

    //Eg
    println(Test.name)
    println("The answer of addition is ${Test.add(3, 2)}")
    println("The answer of addition is ${Test.add(10, 15)}")
}

class Test1{
    init {
        println("Test1 class invoked.")
    }
}

// Test is the singleton class here
object Test {
    init {
        println("Singleton class invoked.")
    }

    var name = "Test Is Best"

    fun add(num1: Int, num2: Int): Int {
        return num1.plus(num2)
    }
}

