import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        * N 을 1,2,3으로 만들어 낼 수 있는 갯수의 합
        * 1 -> 1
        * 2 -> 2
        * 3 -> 4
        * 4 -> 7
        * 5 -> 13
        * 6 -> 24
        * 7 -> 44
        * 1 + 1 + 1 + 1 + 1
        * 2 + 1 + 1 + 1
        * 1 + 2 + 1 + 1
        * 1 + 1 + 2 + 1
        * 1 + 1 + 1 + 2
        * 2 + 2 + 1
        * 2 + 1 + 2
        * 1 + 2 + 2
        * 3 + 1 + 1
        * 1 + 3 + 1
        * 1 + 1 + 3
        * 3 + 2
        * 2 + 3
        * --------------------
        * 6 - >
        * 1 + 1 + 1 + 1 + 1 + 1
        * 2 + 1 + 1 + 1 + 1
        * 1 + 2 + 1 + 1 + 1
        * 1 + 1 + 2 + 1 + 1
        * 1 + 1 + 1 + 2 + 1
        * 1 + 1 + 1 + 1 + 2
        * 2 + 2 + 1 + 1
        * 2 + 1 + 2 + 1
        * 1 + 2 + 2 + 1
        * 1 + 1 + 2 + 2
        * 1 + 2 + 1 + 2
        * 2 + 1 + 1 + 2
        * 3 + 1 + 1 + 1
        * 1 + 3 + 1 + 1
        * 1 + 1 + 3 + 1
        * 1 + 1 + 1 + 3
        * 3 + 2 + 1
        * 3 + 1 + 2
        * 2 + 3 + 1
        * 2 + 1 + 3
        * 1 + 2 + 3
        * 1 + 3 + 2
        * 2 + 2 + 2
        * 3 + 3
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int n=4; n<11; n++) {
            dp[n] = dp[n-1] + dp[n-2] + dp[n-3];
        }
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N]);
        }
    }
}
