fun main() {
    val testCases = readln().toInt()
    
    repeat(testCases) {
        val numbers = readln().split(" ").map { it.toInt() }
        
        val thirdLargest = numbers.sortedDescending()[2]
        println(thirdLargest)
    }
}