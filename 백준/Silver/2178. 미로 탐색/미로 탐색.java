import java.io.*;
import java.util.*;

public class Main {
    // Problem Number 2178
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int N,M;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        //갈 수 있는 곳 bfs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(str.substring(j,j+1));
            }
        }
        visited[0][0] = true;
        bfs(0,0,A);
        bw.write(String.valueOf(A[N-1][M-1]));
        bw.flush();
    }
    private static void bfs(int x, int y,int[][] array){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        while(!queue.isEmpty()){
            int[] now = queue.poll();

            for(int i=0; i<4; i++){
                int nowx = now[0] + dx[i];
                int nowy = now[1] + dy[i];

                if(nowx >=0 && nowy>=0 && nowx<N && nowy < M){
                    if(array[nowx][nowy]==1 && !visited[nowx][nowy]){
                        queue.offer(new int[] {nowx,nowy});
                        visited[nowx][nowy] = true;
                        array[nowx][nowy] = array[now[0]][now[1]]+1;
                    }
                }
            }
        }
    }
}
