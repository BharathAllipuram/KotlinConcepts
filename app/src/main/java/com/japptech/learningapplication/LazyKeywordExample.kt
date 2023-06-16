package com.japptech.learningapplication


// ‘lazy initialization’ was designed to prevent unnecessary initialization of objects.
// You variables will not be initialised unless you use it in your code
// It is initialized only once. Next time when you use it, you get the value from cache memory.

// It is thread safe
// It is initialized in the thread where it is used for the first time.
// Other threads use the same value stored in the cache

// The variable can be var or val.
// The variable can be nullable or non-nullable

class Example {
    val expensiveProperty: Int by lazy {
        println("Calculating expensive property...")
        // Perform complex computation or initialization logic here
        42
    }
}

fun main() {
    val example = Example()
    println("Before accessing property")
    println(example.expensiveProperty)
    println("After accessing property")
    println(example.expensiveProperty)
}

