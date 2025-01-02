fun main() {
    val (n, b, h, w) = readln().split(" ").map { it.toInt() }
    var minCost = Int.MAX_VALUE
    
    repeat(h) {
        val price = readln().toInt()
        val beds = readln().split(" ").map { it.toInt() }
        
        val totalPrice = price * n
        if (totalPrice <= b) {
            for (availableBeds in beds) {
                if (availableBeds >= n && totalPrice < minCost) {
                    minCost = totalPrice
                }
            }
        }
    }
    
    if (minCost == Int.MAX_VALUE) {
        println("stay home")
    } else {
        println(minCost)
    }
}