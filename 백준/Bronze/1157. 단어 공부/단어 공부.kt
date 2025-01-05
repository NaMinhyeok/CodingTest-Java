fun main() {
    val word = readln().uppercase()
    val frequencyMap = IntArray(26) { 0 }
    
    for (char in word) {
        if (char in 'A'..'Z') {
            frequencyMap[char - 'A']++
        }
    }
    
    val maxFrequency = frequencyMap.maxOrNull() ?: 0
    val maxCount = frequencyMap.count { it == maxFrequency }
    
    if (maxCount > 1) {
        println("?")
    } else {
        val maxIndex = frequencyMap.indexOf(maxFrequency)
        println(('A' + maxIndex).toChar())
    }
}