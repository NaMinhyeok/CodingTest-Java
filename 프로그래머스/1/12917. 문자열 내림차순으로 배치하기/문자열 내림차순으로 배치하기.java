import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char[] reversedArr = s.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            reversedArr[i] = arr[arr.length-i-1];
        }

        answer = new String(reversedArr);
        
        return answer;
    }
}