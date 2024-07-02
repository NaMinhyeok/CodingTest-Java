import java.io.*;
import java.util.*;

public class Main {
    static int N,M,K;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = new int[]{1,0,-1,0};
    static int[] dy = new int[]{0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());   // 테스트케이스의 개수 T
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());   // 배추밭의 가로길이
            N = Integer.parseInt(st.nextToken());   // 배추밭의 세로길이
            K = Integer.parseInt(st.nextToken());   // 배추가 심어져있는 위치의 개수
            arr = new int[M][N];
            visited = new boolean[M][N];
            for(int j=0; j<K; j++){
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                arr[X][Y] = 1;
            }
            int count=0;
            for(int x=0; x<M; x++){
                for(int y=0; y<N; y++){
                    if(arr[x][y]==1 && !visited[x][y]){
                        dfs(x,y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    private static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int nowx = x+dx[i];
            int nowy = y+dy[i];
            if(nowx < M && nowx >= 0 && nowy <N && nowy >=0){
                if(!visited[nowx][nowy] && arr[nowx][nowy]==1){
                    dfs(nowx,nowy);
                }
            }
        }
    }
}
