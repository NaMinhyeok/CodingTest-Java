import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int idx=0;
        int count = 0;
        while(!s.equals("1")){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                // 0을 제거
                if((s.substring(i,i+1)).equals("1")){
                    sb.append(s.substring(i,i+1));
                } else {
                    count++;
                }
            }
            // sb의 길이 만큼 이진수로 변환 
            s = Integer.toBinaryString((sb.toString()).length());
            idx++;
        }

        answer = new int[] {idx,count};
        return answer;
    }
}