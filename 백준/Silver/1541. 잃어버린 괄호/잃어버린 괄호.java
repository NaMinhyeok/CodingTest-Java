import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int sum = Integer.MAX_VALUE;
        // 첫번째 수는 + 인걸 고려해야된다.
        while(st.hasMoreTokens()){
            int add = 0;
            StringTokenizer plus = new StringTokenizer(st.nextToken(),"+");
            while(plus.hasMoreTokens()){
                add += Integer.parseInt(plus.nextToken());
            }
            if(sum == Integer.MAX_VALUE){
                sum = add;
            } else {
                sum -= add;
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
    }

}