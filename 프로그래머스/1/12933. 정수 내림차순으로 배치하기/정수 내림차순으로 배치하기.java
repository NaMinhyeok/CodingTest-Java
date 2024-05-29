import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = Long.toString(n);
        
        int[] arr = new int[num.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(num.substring(i,i+1));
        }
        Arrays.sort(arr);
        num = "";
        for(int i=arr.length-1; i>=0; i--){
            num += arr[i];
        }
        answer = Long.valueOf(num);
        return answer;
    }
}