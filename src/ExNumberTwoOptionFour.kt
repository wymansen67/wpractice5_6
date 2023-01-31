import java.lang.NumberFormatException
import kotlin.system.exitProcess

fun main() = try {
    println("пиши циферку")
    var number: String? = readln()
    if (number != null) {
        for (i in 0 .. number.length-1) {
            if (number[i].isLetter()) {
                println("Было введено не число")
                exitProcess(0)
            }
        }
    }
    var last: Char? = number?.get(number.length-1)
    var first: Char? = number?.get(0)

    var comp: String? = "False"

    if (first == last) { comp = "True" }
        when (comp)
        {
            "True" -> {
                println("Число - палиндром")
            }
            else -> {
                println("Число не палиндром")
            }
        }

}
catch (e: NumberFormatException) { println("Было введено не число") }
