fun main() {
    val n = readln().toInt() // 색종이의 수
    
    // 도화지를 표현하는 2차원 배열 (100x100)
    val paper = Array(100) { BooleanArray(100) { false } }
    
    // 각 색종이의 위치를 입력받아 도화지에 표시
    repeat(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        
        // 색종이가 차지하는 영역을 true로 표시 (10x10)
        for (i in x until x + 10) {
            for (j in y until y + 10) {
                paper[i][j] = true
            }
        }
    }
    
    // 검은 영역(true로 표시된 칸)의 개수를 세기
    var blackArea = 0
    for (i in 0 until 100) {
        for (j in 0 until 100) {
            if (paper[i][j]) blackArea++
        }
    }
    
    println(blackArea)
}