fun main() {
    val count = readln().toInt()
    val books = mutableMapOf<String, Int>()
    repeat(count) {
        val bookName = readln()
        books[bookName] = books.getOrDefault(bookName, 0) + 1
    }
    val max = books.values.maxOrNull()
    books.filter { it.value == max }.keys.sorted().first().let(::println)
}