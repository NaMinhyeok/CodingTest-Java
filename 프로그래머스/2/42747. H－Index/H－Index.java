import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int temp[];
        temp = citations.clone();
        Arrays.sort(temp);
        int n = temp.length;
        int h = 0;
        int hindex = 0;
        for(int i=0; i<n; i++){
            h = temp[i];
            hindex = Math.min(h,n-i);
            answer = Math.max(hindex,answer);
        }
        
        return answer;
    }
}