
fun main() {

    /** Scope Function: 'let'
    Property 1: Refer to context object by using 'it'
    Property 2: The return value is the 'lambda result'  */

    // Use 'let' function to avoid NullPointerException

    val name: String? = "hello"

    // Execute the lambda expression only if the 'name' variable is NOT NULL
    val stringLength :Int? = name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length
    }

    println(stringLength)
}