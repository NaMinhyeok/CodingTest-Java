class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] numlist = new int[included.length];
        numlist[0] = a;
        for(int i =1; i<included.length; i++){
            numlist[i] = numlist[i-1]+d;
        }
        for(int i = 0; i<included.length; i++){
            if (included[i]) {
                answer += numlist[i];
            }
        }
        return answer;
    }
}