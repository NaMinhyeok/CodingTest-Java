import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    static List<Integer>[] list;
    static boolean[] visited;
    static int result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());
        list = new ArrayList[N+1];
        visited = new boolean[N+1];
        for(int i=1; i<N+1; i++){
            list[i] = new ArrayList<>();
            visited[i] = false;
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }
        dfs(a,b,0);
        if(result==-1){
            bw.write("-1");
        } else {
            bw.write(String.valueOf(result));
        }
        bw.flush();
    }
    // dfs
    static void dfs(int start, int end,int count){
        if(start == end) {
            result = count;
            return;
        }
        visited[start] = true;
        for(int i=0; i< list[start].size(); i++){
            int now = list[start].get(i);
            if(!visited[now]){
                dfs(now,end,count+1);
            }
        }
    }

}
