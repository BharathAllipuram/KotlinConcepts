

/*
* FOR Loop
* */
fun main() {

    var maxNum = 20

    for (i in 1..maxNum) {
        if (i % 2 == 0) {
            println(i)
            maxNum += 2
            println("maxNum : $maxNum")
        }
    }

    println()

    for (i in 10 downTo 0) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

