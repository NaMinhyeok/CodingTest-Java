fun main() {
    val t = readln().toInt()
    
    repeat(t) {
        val k = readln().toInt()
        val n = readln().toInt()
        println(getResidents(k, n))
    }
}

fun getResidents(k: Int, n: Int): Int {
    val dp = Array(k + 1) { IntArray(n + 1) }
    
    for (i in 1..n) {
        dp[0][i] = i
    }
    
    for (floor in 1..k) {
        for (room in 1..n) {
            dp[floor][room] = (1..room).sumOf { dp[floor-1][it] }
        }
    }
    
    return dp[k][n]
}