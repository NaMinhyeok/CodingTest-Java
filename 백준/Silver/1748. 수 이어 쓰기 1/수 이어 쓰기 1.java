import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = 0L;
        int num = 10;
        int digit = 1;
        for(int i=1; i<=N; i++) {
            if(i%num == 0) {
                digit++;
                num *= 10;
            }
            result += digit;
        }
        System.out.println(result);
    }
}