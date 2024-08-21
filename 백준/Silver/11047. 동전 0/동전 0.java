import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        while(K > 0) {
            int min = 1;
            for(int i=0; i<N; i++) {
                if(K-arr[i] >= 0) {
                    min=Math.max(min,arr[i]);
                }
            }
            count += K/min;
            K -= (K/min) * min;
        }
        System.out.println(count);
    }
}