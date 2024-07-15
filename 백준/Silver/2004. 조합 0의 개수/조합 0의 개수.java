import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        /*
        * 조합은 nCr = nPr / r!
        * nCm = nPm / m! == n! / (n-m)! * m!
        * 25C12 = 25 * 24 * --- * 14 / 12!
        * 분자의 5의 개수 - 분모의 5의 개수
        * 분자의 5의 개수 = N!의 5의 개수 
        * 끝자리 0의 개수 = N!의 5의 개수 - (N-M)!의 5의 개수 - M!의 5의 개수
        * 근데 2의 개수가 부족할 수도 있으니까 5의 개수와 2의 개수 비교해서 더 작은값 출력하기
        * */
        long count5 = five(N) - five(N-M) - five(M);
        long count2 = two(N) - two(N-M) - two(M);
        System.out.println(Math.min(count5, count2));

    }
    private static long five(long num){
        long count = 0;
        while (num >= 5) {
            count += num/5;
            num /= 5;
        }
        return count;
    }
    private static long two(long num){
        long count = 0;
        while (num >= 2) {
            count += num/2;
            num /= 2;
        }
        return count;
    }
}
