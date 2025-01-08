fun main() {
    val n = readln().toInt()
    val names = List(n) { readln() }
    
    val isIncreasing = names.zipWithNext().all { (a, b) -> a < b }
    val isDecreasing = names.zipWithNext().all { (a, b) -> a > b }
    
    println(when {
        isIncreasing -> "INCREASING"
        isDecreasing -> "DECREASING"
        else -> "NEITHER"
    })
}