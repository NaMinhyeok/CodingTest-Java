import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        list = new ArrayList[V+1];
        visited = new boolean[V+1];
        for(int i=1; i<V+1; i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0; i<E; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        dfs(1);
        System.out.print(count);
    }
    private static void dfs(int node){
        if(visited[node]){
            return;
        }
        visited[node] = true;
        for(int v : list[node]){
            if(!visited[v]){
                count++;
                dfs(v);
            }
        }
    }
}
