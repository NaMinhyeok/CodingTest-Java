import java.io.*;
import java.util.*;

public class Main {
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
    static int[] dy = {0, 1, 0, -1, 1, -1, -1, 1};
    static int w, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer wh = new StringTokenizer(br.readLine());
            w = Integer.parseInt(wh.nextToken());
            h = Integer.parseInt(wh.nextToken());
            if (w == 0 && h == 0) {
                return;
            }
            board = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (board[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 8; i++) {
            int nowx = x + dx[i];
            int nowy = y + dy[i];
            if (nowx < h && nowy < w && nowx >= 0 && nowy >= 0 && !visited[nowx][nowy] && board[nowx][nowy] == 1) {
                dfs(nowx, nowy);
            }
        }
    }
}