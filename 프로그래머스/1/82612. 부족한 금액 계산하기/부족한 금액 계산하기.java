class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        answer = money;
        for(int i=1; i<=count; i++){
            answer -= price * i;
        }
        if(answer >=0) {
            return 0;
        } else {
            return Math.abs(answer);
        }
    }
}