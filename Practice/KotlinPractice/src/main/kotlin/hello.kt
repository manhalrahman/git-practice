fun main() {
    val division = try {
        divide(5.0, 0.0)
    }
    catch(e : DivideByZeroException) {
        0.0
    }

    println(division)

    val input = try {
        readLine()?.toInt()
    } catch(e: NumberFormatException) {
        0
    } finally {
        println("this is the finally block")
    }
    println("You ente")

}

class DivideByZeroException : Exception("Can't divide by zero")

fun divide (a: Double, b : Double) : Double{
    if(b == 0.0) {
        throw DivideByZeroException()
    }
    return a/b
}




