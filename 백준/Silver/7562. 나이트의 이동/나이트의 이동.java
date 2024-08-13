import java.io.*;
import java.util.*;

public class Main {
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {1, 2, -1, 2, -2, -1, -2, 1};
    static int[] dy = {2, 1, 2, -1, -1, -2, 1, -2};
    static int I, targetX, targetY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            I = Integer.parseInt(br.readLine());
            board = new int[I][I];
            visited = new boolean[I][I];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            targetX = Integer.parseInt(st.nextToken());
            targetY = Integer.parseInt(st.nextToken());
            bfs(x,y);
            System.out.println(board[targetX][targetY]);
        }
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            if(now[0] == targetX && now[1] == targetY) {
                return;
            }
            for (int i = 0; i < 8; i++) {
                int nextX = now[0] + dx[i];
                int nextY = now[1] + dy[i];
                if (nextX < I && nextY < I && nextX >= 0 && nextY >= 0 && !visited[nextX][nextY]) {
                    queue.add(new int[]{nextX,nextY});
                    visited[nextX][nextY] = true;
                    board[nextX][nextY] = board[now[0]][now[1]] + 1;
                }
            }
        }
    }
}