fun main() {
    val words = List(5) { readln() }
    
    val maxLength = words.maxOf { it.length }
    
    val result = StringBuilder()
    
    for (col in 0 until maxLength) {
        for (row in 0 until 5) {
            if (col < words[row].length) {
                result.append(words[row][col])
            }
        }
    }
    
    println(result.toString())
}