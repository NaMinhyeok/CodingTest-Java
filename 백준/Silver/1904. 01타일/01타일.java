import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 타일이 00 또는 1 두개만 존재한다.
        // N이 1일 때 1 N이 2일 때 11, 00
        // N이 3이면 100, 001, 111
        // N이 4 일 때 1001, 1100, 0011, 1111, 0000
        // N이 5이면 11100, 11111, 11001, 10011, 10000,00111,00001,00100
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 1;
        if(N==1){
            bw.write(String.valueOf(dp[1]));
            bw.flush();
            return;
        }
        dp[2] = 2;
        for(int i=3; i<=N; i++){
            dp[i] = (dp[i-1] + dp[i-2])%15746;
        }
        bw.write(String.valueOf(dp[N]));
        bw.flush();
    }
}