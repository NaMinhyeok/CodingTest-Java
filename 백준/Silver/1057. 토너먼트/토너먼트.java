import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 참가자수 N 김지민 k 임한수 l
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int count = 0;
        while(k!=l) {
            k = Math.round((float) k /2);
            l = Math.round((float) l /2);
            count++;
        }
        System.out.println(count);
    }
}