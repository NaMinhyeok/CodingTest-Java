fun main() {
    val daysInMonth = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    
    val dayOfWeek = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    
    val (month, day) = readln().split(" ").map { it.toInt() }
    
    var totalDays = day
    for (i in 0 until month - 1) {
        totalDays += daysInMonth[i]
    }
    
    println(dayOfWeek[totalDays % 7])
}