import java.awt.*;
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<N+1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[1] = arr[1];
        for(int i=2; i<N+1; i++){
            dp[i] = arr[i];
            for(int j=1; j< i; j++){
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[j]+arr[i],dp[i]);
                }
            }
        }
        int max = 0;
        for(int i : dp){
            max = Math.max(i,max);
        }
        System.out.println(max);
    }
}