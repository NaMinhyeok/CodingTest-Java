import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MAX_SIZE = 1001;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx = 1;
        while(st.hasMoreTokens()) {
            arr[idx++] = Integer.parseInt(st.nextToken());
        }
        // i 값이 누적될 수록 크기 비교해서 갱신
        // DP[1] = P[1]
        // DP[2] = P[1] + DP[1]
        // DP[3] = P[1] + DP[2]
        // DP[3] = P[2] + DP[1]
        // DP[4] = P[1] + DP[3]
        // DP[4] = P[2] + DP[2]
        // DP[i] = P[n] + DP[i-n]
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                dp[i] = Math.max(dp[i],arr[j] + dp[i-j]);
            }
        }
        System.out.println(dp[n]);
    }
}
