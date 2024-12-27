fun main() {
    val number = readln()
    
    if (number.length == 1) {
        println("NO")
        return
    }
    
    for (i in 1 until number.length) {
        val firstPart = number.substring(0, i)
        val secondPart = number.substring(i)
        
        var firstProduct = 1L
        var secondProduct = 1L
        
        for (digit in firstPart) {
            firstProduct *= (digit - '0')
        }
        
        for (digit in secondPart) {
            secondProduct *= (digit - '0')
        }
        
        if (firstProduct == secondProduct) {
            println("YES")
            return
        }
    }
    
    println("NO")
}