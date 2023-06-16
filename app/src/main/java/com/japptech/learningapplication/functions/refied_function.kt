package com.japptech.learningapplication.functions

inline fun <reified T> filterByType(list: List<Any>): List<T> {
    return list.filterIsInstance<T>()
}

fun main() {
    val mixedList: List<Any> = listOf(1, "two", 3.0, true, "four", 5)

    val strings: List<String> = filterByType(mixedList)
    println("Strings: $strings")

    val numbers: List<Int> = filterByType(mixedList)
    println("Numbers: $numbers")

    val booleans: List<Boolean> = filterByType(mixedList)
    println("Booleans: $booleans")
}