class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 롤러의 길이 m
        // 벽의 구역의 마지막 n : 1 ~ n 까지
        // section은 빈 구역
        
        // initialize
        int[] arr = new int[n+1];
        for(int color : section) {
            arr[color] = 1;
        }
        
        int count = 0;
        
        for(int i=1; i<n+1; i++) {
            if (arr[i] == 1) {
                count++;
                for(int j=0; j<m; j++) {
                    if(i+j >= n+1) break;
                    arr[i+j] = 0;
                }
            }
        }
        
        return count;
    }
}