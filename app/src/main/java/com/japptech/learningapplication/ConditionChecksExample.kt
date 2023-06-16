package com.japptech.learningapplication

fun main () {
    whenCondition("Moon")
    ifElseIfCondition(30)
}

fun whenCondition(name : String){
    when(name) {
        "Sun","Moon" -> {println("Sun is a Star")}
        "Sun" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("I don't know anything about it")
    }
}

fun ifElseIfCondition(time : Int){
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
}