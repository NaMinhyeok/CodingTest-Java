import java.io.*;
import java.util.*;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        /*
        * 2 * N 에 2 * 1 또는 1 * 2 타일을 넣어서 채울 수 있는 경우의 수의 합
        * N 이 1이면 1
        * 2이면 1 + 1
        * 3이면 1 + 2
        * 4 이면 1 + 1 + 3
        * 5 이면 1 + 3 + 4
        *
        * 1 -> 1
        * 2 -> 2
        * 3 -> 3
        * 4 -> 5
        * 5 -> 8
        * 피보나치아님?
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=N; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }
        System.out.println(dp[N]);
    }
}
