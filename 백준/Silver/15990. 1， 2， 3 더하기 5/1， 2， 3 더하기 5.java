import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[][] dp = new long[100001][4];
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        for(int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[1][1] = 1L;
        dp[2][2] = 1L;
        dp[3][1] = 1L;
        dp[3][2] = 1L;
        dp[3][3] = 1L;
        for(int j=4; j<=100000; j++) {
            dp[j][1] = (dp[j-1][2] + dp[j-1][3]) % 1000000009L;
            dp[j][2] = (dp[j-2][1] + dp[j-2][3]) % 1000000009L;
            dp[j][3] = (dp[j-3][1] + dp[j-3][2]) % 1000000009L;
        }
        for(int i=0; i<T; i++) {
            System.out.println((dp[arr[i]][1] + dp[arr[i]][2] + dp[arr[i]][3])%1000000009);
        }
    }
}
