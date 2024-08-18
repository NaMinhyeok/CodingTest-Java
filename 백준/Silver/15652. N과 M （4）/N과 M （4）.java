import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new int[M];
        dfs(1,0);
    }

    private static void dfs(int idx, int depth) {
        if(depth == M) {
            StringBuilder sb = new StringBuilder();
            for(int num : result) {
                sb.append(num).append(" ");
            }
            System.out.println(sb);
            return;
        }
        for(int i=idx; i<=N; i++) {
            result[depth] = i;
            dfs(i,depth+1);
        }
    }
}