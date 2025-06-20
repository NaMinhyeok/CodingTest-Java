class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        // n개의 합이 s인 집합 중 가장 곱이 큰 결과를 찾는다
        if(n>s) {
            return new int[]{-1};
        }
        // 집합 만드는법 ?
        // s / n 
        int mod = s/n;
        int remain = s%n;
        for(int i=0; i<n; i++) {
            answer[i] = mod;
        }
        for(int i=n-1; i>=n-remain; i--) {
            answer[i] += 1;
        }
        return answer;
    }
}