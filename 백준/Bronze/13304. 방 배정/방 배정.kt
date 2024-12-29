fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    
    val students = mutableMapOf<Pair<Int, Int>, Int>()
    
    repeat(n) {
        val (s, y) = readLine()!!.split(" ").map { it.toInt() }
        val key = Pair(y, s)
        students[key] = (students[key] ?: 0) + 1
    }
    
    var totalRooms = 0
    
    val total12 = (1..2).sumOf { grade ->
        (students[Pair(grade, 0)] ?: 0) + (students[Pair(grade, 1)] ?: 0)
    }
    totalRooms += (total12 + k - 1) / k
    
    for (gender in 0..1) {
        val total34 = (3..4).sumOf { grade ->
            students[Pair(grade, gender)] ?: 0
        }
        if (total34 > 0) {
            totalRooms += (total34 + k - 1) / k
        }
    }
    
    for (gender in 0..1) {
        val total56 = (5..6).sumOf { grade ->
            students[Pair(grade, gender)] ?: 0
        }
        if (total56 > 0) {
            totalRooms += (total56 + k - 1) / k
        }
    }
    
    println(totalRooms)
}