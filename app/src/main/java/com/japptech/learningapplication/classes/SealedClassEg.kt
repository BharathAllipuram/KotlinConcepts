package com.japptech.learningapplication.classes

import com.japptech.learningapplication.classes.openclass.OpenClassExample
import com.japptech.learningapplication.classes.openclass.WaterMelon

// A sealed class with a string property
open class Fruit(val x: String) : OpenClassExample() {
    // Two subclasses of sealed class defined within
    class Apple : Fruit("Apple")
    class Mango : Fruit("Mango")
}

// A subclass defined outside the sealed class
class Pomegranate : Fruit("Pomegranate")

// A function to take in an object of type Fruit
// And to display an appropriate message depending on the type of Fruit
fun display(fruit: Fruit) {
    when (fruit) {
        is Fruit.Apple -> println("${fruit.x} is good for iron")
        is Fruit.Mango -> println("${fruit.x} is delicious")
        is Pomegranate -> println("${fruit.x} is good for vitamin d")
        is WaterMelon -> println("${fruit.x} is good source of water content")
    }
}

fun main() {
    // Objects of different subclasses created
    val obj = Fruit.Apple()
    val obj1 = Fruit.Mango()
    val obj2 = Pomegranate()
    val obj3 = WaterMelon()

    // Function called with different objects
    display(obj)
    display(obj1)
    display(obj2)
    display(obj3)
}
