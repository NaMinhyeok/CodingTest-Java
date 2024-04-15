import java.io.*;
import java.util.*;

public class Main {
    //문제
    //N개의 도시가 있다. 그리고 한 도시에서 출발하여 다른 도시에 도착하는 M개의 버스가 있다. 우리는 A번째 도시에서 B번째 도시까지 가는데 드는 버스 비용을 최소화 시키려고 한다. A번째 도시에서 B번째 도시까지 가는데 드는 최소비용을 출력하여라. 도시의 번호는 1부터 N까지이다.
    //
    //입력
    //첫째 줄에 도시의 개수 N(1 ≤ N ≤ 1,000)이 주어지고 둘째 줄에는 버스의 개수 M(1 ≤ M ≤ 100,000)이 주어진다. 그리고 셋째 줄부터 M+2줄까지 다음과 같은 버스의 정보가 주어진다. 먼저 처음에는 그 버스의 출발 도시의 번호가 주어진다. 그리고 그 다음에는 도착지의 도시 번호가 주어지고 또 그 버스 비용이 주어진다. 버스 비용은 0보다 크거나 같고, 100,000보다 작은 정수이다.
    //
    //그리고 M+3째 줄에는 우리가 구하고자 하는 구간 출발점의 도시번호와 도착점의 도시번호가 주어진다. 출발점에서 도착점을 갈 수 있는 경우만 입력으로 주어진다.
    //
    //출력
    //첫째 줄에 출발 도시에서 도착 도시까지 가는데 드는 최소 비용을 출력한다.
    static int N,M,startCity,endCity;
    static StringTokenizer st;
    static ArrayList<ArrayList<Node>> list;
    static boolean[] visited;
    static int[] dist;
    static class Node implements Comparable<Node>{
        int end;
        int weight;

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            // 가장 작은 가중치를 가진 객체를 꺼내기위해서
            return weight-o.weight;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            list.get(start).add(new Node(end,weight));
        }
        st = new StringTokenizer(br.readLine());
        startCity = Integer.parseInt(st.nextToken());
        endCity = Integer.parseInt(st.nextToken());
        System.out.println(dijkstra(startCity,endCity));
    }
    // 다익스트라
    public static int dijkstra(int start, int end){
        visited = new boolean[N+1];
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.offer(new Node(start,0));
        dist = new int[N+1];
        for(int i=1; i<=N; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[start] = 0;
        while(!queue.isEmpty()){
            Node curNode = queue.poll();
            int cur = curNode.end;
            if(!visited[cur]){
                visited[cur] = true;

                for(Node node : list.get(cur)){
                    if(!visited[node.end] && dist[node.end]>dist[cur]+ node.weight){
                        dist[node.end] = dist[cur]+ node.weight;
                        queue.add(new Node(node.end, dist[node.end]));
                    }
                }
            }
        }
        return dist[end];
    }
}
