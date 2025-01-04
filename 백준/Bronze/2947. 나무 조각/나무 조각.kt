fun main() {
    val numbers = readln().split(" ").map { it.toInt() }.toMutableList()
    
    while (!isSorted(numbers)) {
        for (i in 0..3) {
            if (numbers[i] > numbers[i + 1]) {
                val temp = numbers[i]
                numbers[i] = numbers[i + 1]
                numbers[i + 1] = temp
                println(numbers.joinToString(" "))
            }
        }
    }
}

fun isSorted(list: List<Int>): Boolean {
    return list == listOf(1, 2, 3, 4, 5)
}