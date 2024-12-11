import java.util.StringTokenizer

fun main() {
    System.`in`.bufferedReader().use {
        val count = it.readLine().toInt()
        val array = Array(count) { IntArray(2) }
        for (i in 0 until count) {
            val st = StringTokenizer(it.readLine())
            val weight = st.nextToken().toInt()
            val height = st.nextToken().toInt()
            array[i][0] = weight
            array[i][1] = height
        }
        for(i in 0 until count) {
            var rank = 1
            for(j in 0 until count) {
                if (i == j) continue
                if (array[i][0] < array[j][0] && array[i][1] < array[j][1]) {
                    rank++
                }
            }
            print("$rank ")
        }
    }
}