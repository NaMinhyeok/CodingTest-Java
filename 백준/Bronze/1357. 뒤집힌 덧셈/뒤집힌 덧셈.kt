fun reverseNumber(num: Int): Int {
    return num.toString().reversed().toInt()
}

fun main() {
    val (x, y) = readln().split(" ").map { it.toInt() }
    val result = reverseNumber(reverseNumber(x) + reverseNumber(y))
    println(result)
}