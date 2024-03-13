class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] mon = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int sum = 0;
        // 1,3,5,7,8,10,12월 31일 2월 29일 4,6,9,11월 30일
        if(a>1){
            for(int i=0; i<a-1; i++){
            sum += mon[i];
            }
            sum += b;
            return day[(sum%7)];
        } else {
            return day[(b%7)];
        }
    }
}