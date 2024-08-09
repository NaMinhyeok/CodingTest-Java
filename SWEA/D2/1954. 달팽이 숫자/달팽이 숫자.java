import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        for(int tc = 1; tc <= TC; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];
            int x = 0;
            int y = 0;
            int dir = 0;
            for(int i=1; i<=N*N; i++) {
                arr[x][y] = i;
                int nowx = x + dx[dir];
                int nowy = y + dy[dir];
                if(nowx >= N || nowy >= N || nowx < 0 || nowy < 0 || arr[nowx][nowy] !=0) {
                    dir = (dir + 1) % 4;
                }
                x = x + dx[dir];
                y = y + dy[dir];
            }
            System.out.println("#" + tc );
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}