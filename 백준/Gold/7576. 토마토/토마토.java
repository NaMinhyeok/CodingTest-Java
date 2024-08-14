import java.io.*;
import java.util.*;

public class Main {
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N, M;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1) {
                    queue.offer(new int[]{i,j});
                }
            }
        }
        bfs();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                max = Math.max(board[i][j],max);
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(board[i][j]==0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(max-1);
    }

    private static void bfs() {
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = now[0] + dx[i];
                int nextY = now[1] + dy[i];
                if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < M && !visited[nextX][nextY] && board[nextX][nextY] == 0) {
                    visited[nextX][nextY] = true;
                    board[nextX][nextY] = board[now[0]][now[1]] + 1;
                    queue.offer(new int[]{nextX,nextY});
                }
            }
        }
    }
}