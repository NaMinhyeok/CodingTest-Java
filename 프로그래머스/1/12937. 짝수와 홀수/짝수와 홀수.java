class Solution {
    public String solution(int num) {
        String answer = "";
        if(Math.abs(num) % 2 == 1) {
            answer = "Odd";
        }
        else if (Math.abs(num) % 2 == 0){
            answer = "Even";
        }
        else if (Math.abs(num) == 0) {
            answer = "Odd";
        }
        return answer;
    }
}