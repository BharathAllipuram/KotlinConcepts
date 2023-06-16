package com.japptech.learningapplication.classes
/*
*   Data Class
* */
fun main(args: Array<String>) {

    var user1 = User("Sam", 10)

    var user2 = User("Sam", 10)

    println(user1.toString())

    if (user1 == user2)
        println("Equal")
    else
        println("Not equal")

    var newUser = user1.copy(id = 25)
    println(newUser)
    println(user1)

    if (user1 == newUser)
        println("Equal")
    else
        println("Not equal")
}

data class User(
    var name: String,
    var id: Int
)
