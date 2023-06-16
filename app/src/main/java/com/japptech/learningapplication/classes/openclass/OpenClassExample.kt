package com.japptech.learningapplication.classes.openclass

open class OpenClassExample {

}

fun main(){
    val vehicle = Vehicle()
    vehicle.startEngine() // Output: Engine started.

    val car = Car()
    car.startEngine()

}

open class Vehicle {
    open fun startEngine() {
        println("Engine started.")
    }
}

class Car : Vehicle() {
    override fun startEngine() {
        super.startEngine()
        println("Car engine started.")
    }
}