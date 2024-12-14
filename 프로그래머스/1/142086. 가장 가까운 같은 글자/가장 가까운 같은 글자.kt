class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var str = s.reversed()
        for(i in 0 until str.length){
            if(str.indexOf(str[i], i+1) == -1) answer += -1
            else{
                var num = str.indexOf(str[i], i + 1)
                answer += num - i
            }
        }
        return answer.reversedArray()
    }
}