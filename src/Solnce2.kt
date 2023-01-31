fun main()
{
    var z = readLine()!!.toByte()
    when (z)
    {
        in 0 .. 2 -> println("Малышарик")
        in 3 .. 14 -> println("Ребенок")
        in 15 .. 18 -> println("Подросток")
        in 19 .. 70 -> println("Взрослый")
        in 71 .. 127 -> println("Пенсионер")
    }
}