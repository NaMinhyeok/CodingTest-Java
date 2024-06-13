class Solution {
    private int[] dp;
    
    public int solution(int n) {
        dp = new int[n+1];
        return fibonacci(n);
    }
    
    private int fibonacci(int n){
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        if(dp[n] !=0){
            return dp[n];
        }
        return dp[n] = (fibonacci(n-2) + fibonacci(n-1))%1234567;
    }
}