import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[1001];
        for(int i=0; i<visited.length; i++){
            visited[i] = true;
        }
        visited[0] = false;
        visited[1] = false;
        for(int i=2; i<=100; i++){
            if(visited[i]){
                for(int j=i*i; j<=1000; j+=i){
                    visited[j] = false;
                }
            }
        }
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(visited[num]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
