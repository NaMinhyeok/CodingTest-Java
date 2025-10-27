import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int answer;

    private static class Node {
        int r, c;

        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    private static final int[] rx = {0, 0, 1, -1};
    private static final int[] ry = {1, -1, 0, 0};

    private static char[][] board;

    private static boolean[] used;

    private static int R;
    private static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        answer = 0;
        board = new char[R][C];

        used = new boolean['Z' - 'A' + 1];

        for (int i = 0; i < R; i++) {
            board[i] = br.readLine().toCharArray();
        }

        used[board[0][0] - 'A'] = true;
        backtrack(new Node(0,0),1);
        System.out.println(answer);
    }

    private static void backtrack(Node now, int count) {
        answer = Math.max(answer, count);

        for (int i = 0; i < 4; i++) {
            int nr = now.r + rx[i];
            int nc = now.c + ry[i];

            if (nr < 0 || nc < 0 || nr >= R || nc >= C) continue;

            if (used[board[nr][nc] - 'A']) continue;

            used[board[nr][nc] - 'A'] = true;
            backtrack(new Node(nr, nc), count + 1);
            used[board[nr][nc] - 'A'] = false;
        }
    }
}