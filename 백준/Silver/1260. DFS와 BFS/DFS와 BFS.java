import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static StringBuilder dfsResult = new StringBuilder();
    static StringBuilder bfsResult = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하시오.
        // 정점의 번호가 작은 것 부터 탐색할 것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 정점의 개수
        int M = Integer.parseInt(st.nextToken());   // 간선의 개수
        int V = Integer.parseInt(st.nextToken());   // 탐색을 시작할 정점의 번호
        list = new ArrayList[N+1];
        visited = new boolean[N+1];
        for(int i=1; i<N+1; i++){
            list[i] = new ArrayList<Integer>();
        }
        // 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
        // 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        for(int i=1; i<N+1; i++){
            Collections.sort(list[i]);
        }
        dfs(V);
        visited = new boolean[N+1];
        bfs(V);
        System.out.println(dfsResult.toString());
        System.out.println(bfsResult.toString());
    }
    private static void dfs(int node){
        if(visited[node]){
            return;
        }
        dfsResult.append(node+" ");
        visited[node] = true;
        for(int v : list[node]){
            if(!visited[v]){
                dfs(v);
            }
        }
    }
    private static void bfs(int node){
        // 큐에 넣어서 큐에서 먼저 빼고, 자신과 연결된 자식 노드들 모두 큐에 넣기
        Queue<Integer> queue = new LinkedList<>();
        // 최초로 처음 선택된 노드 집어넣기
        queue.offer(node);
        visited[node] = true;
        while(!queue.isEmpty()) {
            int current = queue.poll();
            bfsResult.append(current+" ");
            // 처음 선택된 노드를 큐에서 빼고 간선이 연결된 노드들 큐에 넣기
            for (int v : list[current]) {
                if (!visited[v]) {    // 방문하지 않았다면 큐에 넣기
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
    }
}
