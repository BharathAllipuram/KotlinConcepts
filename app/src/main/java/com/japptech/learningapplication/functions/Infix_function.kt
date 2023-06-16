package com.japptech.learningapplication.functions
/*
*   INFIX FUNCTIONS
* */
fun main() {

    val x = 6
    val y = 10

//    val greaterVal = x.findGreaterValue(y)
    val greaterVal = x findGreaterValue y

    println(greaterVal)
}

infix fun Int.findGreaterValue(other: Int): Int {       // INFIX and Extension Func

    //Here findGreaterValue is the extension function of the Int data type

    if (this > other) // Here this key word refers to the Extended data type Int value
        return this
    else
        return other
}

/*
*       1. All INFIX Functions are Extension functions
*            But all Extension functions are not INFIX
*       2. INFIX Functions just have ONE PARAMETER
* */
