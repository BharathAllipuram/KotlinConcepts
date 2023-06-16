package com.japptech.learningapplication.functions

// Define an extension function for the String class

fun String.addHelloPrefix(): String {
    return "Hello, $this"
}

fun main() {
    val name = "John"
    val greeting = name.addHelloPrefix()
    println(greeting) // Output: Hello, John
}
