//program 1
fun main()
{
    var x = readLine()!!.toDouble()
    var y = readLine()!!.toDouble()
    if (x == y) println(Math.pow(x,3.0))
    else if (x > y) println(x+1)
    else println(y+1)
//program 2
    val z = readLine()!!.toInt()
    when (z)
    {
        0 -> println("Нолик")
        1 -> println("Один")
        2 -> println("Два")
        3 -> println("Три")
        4 -> println("Четыре")
        5 -> println("Пять")
        6 -> println("Шесть")
        7 -> println("Семь")
        8 -> println("Восемь")
        9 -> println("Девять")
    }
//program 3
    var a = readLine()!!.toByte()
    when (a)
    {
        in 0 .. 2 -> println("Малышарик")
        in 3 .. 14 -> println("Ребенок")
        in 15 .. 18 -> println("Подросток")
        in 19 .. 70 -> println("Взрослый")
        in 71 .. 125 -> println("Пенсионер")
    }
}