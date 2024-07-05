import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            q.offer(Integer.parseInt(br.readLine()));
        }
        int result = 0;
        // 1일때는 비교가 필요가 없음
        if(N==1){
            System.out.print(result);
        } else {
            while(q.size()>1){
                int num1 = q.poll();
                int num2 = q.poll();
                result += num1+num2;
                q.offer(num1+num2);
            }
            System.out.print(result);
        }
    }
}
