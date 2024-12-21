fun main() {
    val sb = StringBuilder()
    
    val n = readln().toInt()
    
    val a = IntArray(n)
    val b = IntArray(n)
    
    val input = readln().split(" ").map { it.toInt() }
    for (i in 0 until n) {
        a[i] = input[i]
        b[i] = a[i]
    }
    
    b.sort()
    
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (a[i] == b[j]) {
                sb.append("$j ")
                b[j] = -1
                break
            }
        }
    }
    
    println(sb)
}