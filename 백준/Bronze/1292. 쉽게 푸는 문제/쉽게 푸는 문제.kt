fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    var sum = 0
    
    var num = 1  
    var count = 1  
    var pos = 1 
    
    while (pos <= b) {
        if (pos >= a) {
            sum += num
        }
        
        if (count == num) {
            num++
            count = 1
        } else {
            count++
        }
        pos++
    }
    
    println(sum)
}