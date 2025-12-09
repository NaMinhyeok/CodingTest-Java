import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] countSort = new int[20000001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            countSort[Integer.parseInt(st.nextToken()) + 10000000]++;
        }

        int M = Integer.parseInt(br.readLine());

        StringTokenizer stM = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            sb.append(countSort[Integer.parseInt(stM.nextToken()) + 10000000]).append(" ");
        }

        System.out.println(sb);
    }
}