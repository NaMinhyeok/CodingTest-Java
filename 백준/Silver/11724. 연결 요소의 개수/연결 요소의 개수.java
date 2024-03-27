import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

//P11724
public class Main {
    //문제
    //방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
    //
    //입력
    //첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2) 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.
    //
    //출력
    //첫째 줄에 연결 요소의 개수를 출력한다.
    private static int N;
    private static int M;
    private static boolean visited[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int count = 0;
        visited = new boolean[N+1];
        A = new ArrayList[N+1];
        for(int i=1; i<N+1; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        for(int i=1; i<N+1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
    private static void DFS(int n){
        if(visited[n]){
            return;
        }
        visited[n] = true;
        for(int i : A[n]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}
