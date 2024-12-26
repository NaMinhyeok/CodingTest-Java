fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val baskets = IntArray(n) { it + 1 }
    
    repeat(m) {
        val (begin, end, mid) = readln().split(" ").map { it.toInt() }
        rotate(baskets, begin - 1, end - 1, mid - 1)
    }
    
    println(baskets.joinToString(" "))
}

fun rotate(arr: IntArray, begin: Int, end: Int, mid: Int) {
    val temp = IntArray(end - begin + 1)
    var idx = 0
    
    for (i in mid..end) {
        temp[idx++] = arr[i]
    }
    
    for (i in begin until mid) {
        temp[idx++] = arr[i]
    }
    
    for (i in temp.indices) {
        arr[begin + i] = temp[i]
    }
}