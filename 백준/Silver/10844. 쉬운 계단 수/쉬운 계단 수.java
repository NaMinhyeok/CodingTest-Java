import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n + 1][10];
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1L;
        }
        for(int i=2; i<=n; i++) {
            dp[i][0] = dp[i-1][1] % 1000000000;
            dp[i][9] = dp[i-1][8] % 1000000000;
            for(int j=1; j<9; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
            }
        }
        long result = 0L;
        for(int i=0; i<10; i++) {
            result += dp[n][i];
        }
        System.out.println(result % 1000000000);
    }
}
