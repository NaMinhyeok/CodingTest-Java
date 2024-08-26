class Solution {
    public static int count;
    
    public int solution(int n) {
        int answer = 0;
        count = 0;
        for(int i=1; i<=n; i++) {
            dfs(n,i,0);
        }
        return count;
    }
    private static void dfs(int targetNumber, int now,int num) {
        if(num == targetNumber) {
            count++;
            return;
        }
        if(num > targetNumber) {
            return;
        }
        num += now;
        dfs(targetNumber,now+1,num);
    }
}