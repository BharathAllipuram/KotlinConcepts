package com.japptech.learningapplication.classes

interface CardCashBack {
    fun getCashbackValue(): Float
}

// By default we will get name(enum object), Here we have added color and maxlimit for the enum object.
enum class CreditCardType(val color: String, val maxLimit: Int = 1000000): CardCashBack {
    SILVER("gray", 50000) {
        override fun getCashbackValue(): Float {
            return (maxLimit/2).toFloat()
        }
    },
    GOLD("gold"){
        override fun getCashbackValue(): Float = 0.04f
    },
    PLATINUM("black"){
        override fun getCashbackValue(): Float = (maxLimit/2).toFloat()
    }
}

fun main() {

    /* Access properties and methods */
    println(CreditCardType.SILVER.color)    // gray
    println(CreditCardType.SILVER.getCashbackValue())

    /* Enum constants are objects of enum class type. */
    val cardType: CreditCardType = CreditCardType.GOLD

    /* Each enum object has two properties by default : ordinal and name */
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD)    // OR CreditCardType.GOLD.name

    /* Each enum object has two methods: values() and valueOf() */
    val myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach { print("\t"+it) }

    println( "\nvalue of : "+CreditCardType.valueOf("GOLD"))

    /* Using in 'when' statement */
    when(cardType) {
        CreditCardType.SILVER -> println("Peter has silver card")
        CreditCardType.GOLD -> println("Peter has gold card")
        CreditCardType.PLATINUM -> println("Peter has platinum card")
    }
}