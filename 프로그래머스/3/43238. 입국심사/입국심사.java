class Solution {
    
    private static final int MAX = 1_000_000_000;
    private static int[] time;
    private static int N;
    
    // 총 시간이 있고 이거에 맞는걸 찾기
    public long solution(int n, int[] times) {
        N = n;
        time = times;
        
        long left = 1;
        long right = (long)MAX * MAX;
        // 한명이 할 수 있는 최선
        // 작거나 답 or 크다 이거 무한반복 -> 중앙값잡고 1/2
        while(left < right) {
            long mid = (left + right) / 2;
            if(isPossible(mid)) {
                right = mid;
            } else {
                left= mid + 1;
            }
        }
        return left;
    }
    
    private boolean isPossible(long num) {
        long n = N;
        for(int i: time) {
            // 한명이 처리할 수 있는 인원수
            // num의 시간만큼에서 처리할 수 있는 인원수
            n -= num/i;
        }
        return n <= 0;
    }
}