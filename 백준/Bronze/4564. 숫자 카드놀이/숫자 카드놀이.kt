fun main() {
    while (true) {
        val input = readln().toInt()
        if (input == 0) break
        
        val result = mutableListOf<Int>()
        var current = input
        result.add(current)
        
        while (current >= 10) {
            current = multiplyDigits(current)
            result.add(current)
        }
        
        println(result.joinToString(" "))
    }
}

fun multiplyDigits(number: Int): Int {
    return number.toString()
            .map { it.toString().toInt() }
            .reduce { acc, digit -> acc * digit }
}