

/*
* WHILE Loop
* */
fun main() {

    var maxNum = 10
    var i = 0
    while (i <= maxNum) {
        if (i % 2 == 0) {
            println(i)
            maxNum += 2
        }
        i++
    }

    println()

    var j = 10
    while (j >= 0) {
        if (j % 2 == 0) {
            println(j)
        }
        j--
    }
}

