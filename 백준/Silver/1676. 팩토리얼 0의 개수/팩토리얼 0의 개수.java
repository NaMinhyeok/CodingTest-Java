import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        System.out.println(five(N));
    }
    private static long five(long num){
        long count = 0;
        while (num >= 5) {
            count += num/5;
            num /= 5;
        }
        return count;
    }
}
