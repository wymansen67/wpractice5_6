
fun main()
{
var x = readLine()!!.toDouble()
var y = readLine()!!.toDouble()
if (x == y) println(Math.pow(x,3.0))
else if (x > y) println(x+1)
else println(y+1)
}
