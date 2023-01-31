import java.lang.NumberFormatException

fun main() = try {
    println("пиши циферку")
    val x = readln().toShort()
    when (x)
    {
        in -32768 .. 7 -> println(-3 * x + 9)
        else -> println( 1 / (x - 7) )
    }

} catch (e: NumberFormatException) { println("Было введено не число") }