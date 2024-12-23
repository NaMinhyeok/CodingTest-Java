fun main() {
    val n = readln().toInt()
    val room = Array(n) { readln().toCharArray() }
    
    var horizontal = 0 // 가로로 누울 수 있는 자리
    var vertical = 0   // 세로로 누울 수 있는 자리
    
    // 가로 방향 확인
    for (i in 0 until n) {
        var count = 0
        for (j in 0 until n) {
            if (room[i][j] == '.') {
                count++
            } else {
                if (count >= 2) horizontal++
                count = 0
            }
        }
        if (count >= 2) horizontal++ 
    }
    
    for (j in 0 until n) {
        var count = 0
        for (i in 0 until n) {
            if (room[i][j] == '.') {
                count++
            } else {
                if (count >= 2) vertical++
                count = 0
            }
        }
        if (count >= 2) vertical++
    }
    
    println("$horizontal $vertical")
}