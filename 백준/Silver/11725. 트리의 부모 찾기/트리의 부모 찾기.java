import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        parent = new int[N+1];
        tree = new ArrayList[N+1];
        visited = new boolean[N+1];
        for(int i=0; i<N+1; i++){
            tree[i] = new ArrayList<>();
        }
        for(int i=0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }
        dfs(1);
        for(int i=2; i<N+1; i++){
            System.out.println(parent[i]);
        }
    }
    static void dfs(int index){
        visited[index] = true;
        for(int i=0; i<tree[index].size(); i++){
            int child = tree[index].get(i);
            if(!visited[child]){
                parent[child] = index;
                dfs(child);
            }
        }
    }
}
