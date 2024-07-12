import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if(N<M){
                int temp = M;
                M = N;
                N = temp;
            }
            int divisor = 1;
            long multiple = 0;
            // 최대공약수
            // 작은 수의 절반부터 1까지 탐색
            if(N%M==0){
                divisor = M;
            } else {
                for(int j=M/2; j>0; j--){
                    if(N%j==0 && M%j==0){
                        divisor = j;
                        break;
                    }
                }
            }
            // 최소공배수
            // ((N / divisor) * (M / divisor)) * divisor
            multiple = ((long) (N / divisor) * (M/divisor)) * divisor;
            System.out.println(multiple);
        }

    }
}
