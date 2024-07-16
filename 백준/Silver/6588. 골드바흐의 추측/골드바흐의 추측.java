import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        // isPrime 소수 판별하는 배열
        for(int i=2; i<= Math.sqrt(1000000); i++) {
            if(isPrime[i]){
                for(int j=i*i; j< isPrime.length; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) {
                break;
            }
            boolean answer = false;
            // 기존 투포인터는 시간초과 에러가 난다. 다른 방식으로 투포인터와 비슷한 방식?
            // 골드바흐 추측의 핵심 방법
            // i 랑 n-i 가 둘합을 소수로 표현 할 수 있으니까 이렇게 작성
            // 그리고 b-a의 최대니까 최초로 걸리는 것이 나오면 break 하게 설정
            for(int i = 2; i<=n/2; i++){
                if(isPrime[i] && isPrime[n-i]) {
                    answer = true;
                    System.out.println(n + " = " + i + " + " + (n-i));
                    break;
                }
            }
            if(!answer) {
                System.out.println("Goldbach's conjecture is wrong.");
            }

        }
    }
}
