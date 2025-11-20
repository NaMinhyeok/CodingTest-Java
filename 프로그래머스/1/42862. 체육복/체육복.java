import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 여벌 체육복을 가져온 학생이 도난 당했을 수 있음
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=1; i<n+1; i++) {
            arr[i] = 1;
        }
        for(int i: reserve) {
            arr[i] += 1;
        }
        for(int i: lost) {
            arr[i] -= 1;
        }
        // 정렬이 현재 보장되어있지는 않다.
        Arrays.sort(lost);
        
        for(int i: lost) {
            if (arr[i] >= 1) continue;
            
            if (i > 1 && arr[i - 1] == 2) {
                arr[i - 1] -= 1;
                arr[i] += 1;
            }
            else if (i < n && arr[i + 1] == 2) {
                arr[i + 1] -= 1;
                arr[i] += 1;
            }
        }
        for(int i=1; i<n+1; i++) {
            if(arr[i] > 0) answer++;
        }
        return answer;
    }
}