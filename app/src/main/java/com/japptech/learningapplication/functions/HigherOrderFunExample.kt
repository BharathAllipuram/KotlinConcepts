package com.japptech.learningapplication.functions

fun main(){
//    println(
//        doubleTheSquareFunctionOutput(
//            multiplyValue = 2, squaringFun1 = {
//                println(squareFunction(7))
//                squareFunction((funReturningDivisionFunction(50).invoke()).toInt())
//        }
//    ))


// TakeIf and takeUnless Example

    val a = 20

    if (a < 10) {
        println("Good morning.")
    }

    a.takeIf{
        it < 20
    }
        ?.let{
            println("can join the game with latency $it")
        }

    a.takeUnless{ it < 20}?.let{
            println("warning : high latency $it")
        }
}

//Function returning int
fun squareFunction(squaringNumber : Int) : Int{
    return squaringNumber*squaringNumber
}

//above Function can also be written as below because it is single line function(contains only single line to compile).
fun squareFunction1(squaringNumber : Int) = squaringNumber*squaringNumber

// Function accepting squareFun function as an input
fun doubleTheSquareFunctionOutput(
    multiplyValue : Int,
    squaringFun1 : ()->Int
) : Int{
    return multiplyValue*squaringFun1.invoke()
}

// Function returning another function
fun funReturningDivisionFunction(divisibleNumber : Int) : ()->Float{
    println("return value : ${ divisionFunction(divisibleNumber)}")
    return { divisionFunction(divisibleNumber) }
}

// Function with division
fun divisionFunction(number : Int) : Float{
    println("divisibleNumber : $number")
    return (number/2).toFloat()
}