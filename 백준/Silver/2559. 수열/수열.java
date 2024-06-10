import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int currentSum = 0;
        StringTokenizer num = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(num.nextToken());
        }
        for(int i=0; i<K; i++){
            currentSum += arr[i];
        }
        int max = currentSum;
        for(int i=K; i<N; i++){
            currentSum = currentSum - arr[i-K] + arr[i];
            max = Math.max(max,currentSum);
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}