import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int start = 0;
        int end = 0;
        int sum =0;
        int count =1;
        while(end != N){
            if(sum == N) {
                count++;
                end++;
                sum+=end;
            } else if(sum < N){
                end++;
                sum += end;
            } else if(sum > N){
                sum -= start;
                start++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
