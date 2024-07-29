import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n+1][2];
        if(n==1) {
            System.out.println(1);
            return;
        }
        dp[1][1] = 1L;
        for(int i=2; i<=n; i++) {
            dp[i][1] = dp[i-1][0];
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
        }
        System.out.println(dp[n][0] + dp[n][1]);
    }
}
