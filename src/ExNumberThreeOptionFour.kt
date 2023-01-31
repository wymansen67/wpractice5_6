import java.lang.NumberFormatException

fun main() = try{
println("Введите высоту первого конверта")
var heightA = readLine()!!.toByte()
println("Введите ширину первого конверта")
var widthA = readLine()!!.toByte()
println("Введите высоту второго конверта")
var heightB = readLine()!!.toByte()
println("Введите ширину второго конверта")
var widthB = readLine()!!.toByte()

var pConvertA: Int = 2 * (heightA + widthA)
var pConvertB: Int = 2 * (heightB + widthB)

var max: String? = "none"

if (pConvertA > pConvertB) max = "pConvertA"
else if (pConvertA < pConvertB) max = "pConvertB"

    when (max)
    {
        "pConvertA" -> println("Второй конверт можно вложить в первый конверт")
        "pConvertA" -> println("Первый конверт можно вложить во второй конверт")


        else ->  println("Конверты нельзя поместить друг в друга")
    }
}
catch (e: NumberFormatException) { println("Было введено не число") }