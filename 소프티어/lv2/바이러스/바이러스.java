import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 바이러스가 숙주의 몸속에서 1초당 P배씩 증가
        // 초기에 K 마리 였다면 N초 후에 몇마리 일지
        // K * P의 N승 만큼 증가
        long K = Long.parseLong(st.nextToken());
        long P = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());
        // Math.pow의 값이 long 너무 커질 수 있음 따라서 사용 X
        // long answer = K * (long)Math.pow(P,N) % 1000000007L;
        for(int i=0; i<N; i++){
            K = K * P % 1000000007L;
        }
        System.out.print(K);
    }
}
