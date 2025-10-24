import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    private static int[][] board;
    static ArrayDeque<Node> virus = new ArrayDeque<>();
    static class Node {
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        board = new int[N][M];
        for(int i=0; i<N; i++) {
            stringTokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (board[i][j] == 2) {
                    virus.addLast(new Node(i, j));
                }
            }
        }
        int max = 0;
        ArrayDeque<Node> block = new ArrayDeque<>();

        for (int i = 0; i <N*M-2; i++) {
            if (board[i/M][i%M] != 0) continue;
            block.addLast(new Node(i/M, i%M));
            for (int j = i+1; j <N*M-1; j++) {
                if (board[j/M][j%M] != 0) continue;
                block.addLast(new Node(j/M, j%M));
                for (int k = j+1; k <N*M; k++) {
                    if (board[k/M][k%M] != 0) continue;
                    block.addLast(new Node(k/M, k%M));
                    max = Math.max(max, bfs(block));
                    block.pollLast();
                }
                block.pollLast();
            }
            block.pollLast();
        }
        System.out.println(max);
    }

    private static int bfs(ArrayDeque<Node> block) {
        int[][] temp = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                temp[i][j] = board[i][j];
            }
        }

        for (Node node : block) {
            temp[node.x][node.y] = 1;
        }

        ArrayDeque<Node> queue = new ArrayDeque<>();
        for (Node node : virus) {
            queue.addLast(node);
        }
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }

                if (temp[nx][ny] == 1) {
                    continue;
                }

                if (temp[nx][ny] == 0) {
                    temp[nx][ny] = 2;
                    queue.addLast(new Node(nx, ny));
                }
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (temp[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}