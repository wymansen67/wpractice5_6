import java.lang.NumberFormatException

fun main() = try {
    println("пиши циферку")
    var number: String? = readLine()
    var last: Char? = number?.get(number.length-1)
    var first: Char? = number?.get(0)

    var comp: String? = "False"

    if (first == last) comp = "True"
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
