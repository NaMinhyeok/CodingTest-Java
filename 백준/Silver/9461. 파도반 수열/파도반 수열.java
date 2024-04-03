import java.io.*;
import java.util.*;

public class Main {
    static long len[];
    public static void main(String[] args) throws IOException {
        //문제 9461번
        //P(4) = P(1)+P(2)
        //P(5) = P(2)+P(3)
        //P(N) = P(N-3)+P(N-2)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        len = new long[101];
        for(int i=0; i<101; i++){
            len[i] = -1L;
        }
        len[1] = 1L;
        len[2] = 1L;
        len[3] = 1L;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            long result = triangle(num);
            bw.write(String.valueOf(result)+"\n");
        }
        bw.flush();
    }
    static long triangle(int n){
        if(len[n] != -1L){
            return len[n];
        }
        return len[n] = triangle(n-3)+triangle(n-2);
    }
}
