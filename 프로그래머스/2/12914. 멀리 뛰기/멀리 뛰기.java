class Solution {
    private static long[] dp;
    public long solution(int n) {
        long answer = 0;
        dp = new long[n+1];
        return jump(n);
    }
    private long jump(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        return dp[n] = (jump(n-2) + jump(n-1)) % 1234567;
    }
}