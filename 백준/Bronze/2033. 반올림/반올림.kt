fun main() {
    var num = readln().toInt()
    var position = 10

    while (num > position) {
        val remain = num % position
        val digit = remain / (position / 10)

        if ( digit >= 5 ) {
            num = (num / position + 1) * position
        } else {
            num = num / position * position
        }

        position *= 10
    }

    println(num)
}