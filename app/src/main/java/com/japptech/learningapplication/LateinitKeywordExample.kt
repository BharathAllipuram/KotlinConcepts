package com.japptech.learningapplication

fun main() {
    val country = Country()
    country.name = "India"
    country.setup()
}

class Country {
    lateinit var name: String

    fun setup() {
        if (this::name.isInitialized) {
            // access name
            println("The name of country is $name")
        } else {
            // do something else
            println("name is not initialised")
        }
    }
}

// lateinit used only with mutable data type [ var ]
// lateinit used only with non-nullable data type
// lateinit values must be initialised before you use it

// If you try to access lateinit variable without initializing it then it throws UninitializedPropertyAccessException
