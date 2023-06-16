package com.japptech.learningapplication.functions

fun <T> genericsExample(value: T) {
    println(value)
}

fun main () {
    genericsExample<String>(value = "Learning Generics!")
    genericsExample<Int>(value = 100)
    genericsExample<Float>(value = 100.0f)
    genericsExample<Double>(value = 100.00)
    genericsExample<ArrayList<String>>(value = arrayListOf("A","B","C") )
}

