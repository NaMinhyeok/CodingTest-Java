import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
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
            for(int i=M/2; i>0; i--){
                if(N%i==0 && M%i==0){
                    divisor = i;
                    break;
                }
            }
        }
        System.out.println(divisor);
        // 최소공배수
        // ((N / divisor) * (M / divisor)) * divisor
        multiple = ((long) (N / divisor) * (M/divisor)) * divisor;
        System.out.println(multiple);
    }
}
