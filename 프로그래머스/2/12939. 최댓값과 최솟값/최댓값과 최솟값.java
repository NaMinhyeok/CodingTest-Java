import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s," ");
        int min = Integer.parseInt(st.nextToken());
        int max = min;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}