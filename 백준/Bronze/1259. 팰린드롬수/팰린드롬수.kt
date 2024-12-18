fun main() {
    while (true) {
        val str = readln()
        if (str == "0") break
        
        println(
            if (str == str.reversed()) "yes" else "no"
        )
    }
}