import java.util.*;

class Solution {
    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,1,0,-1};

    public int solution(String[] board) {
        boolean[][] visited = new boolean[board.length][board[0].length()];
        Deque<int[]> queue = new ArrayDeque<>();

        for(int i = 0; i<board.length; i++) {
            for(int j=0; j<board[i].length(); j++) {
                if(board[i].charAt(j) == 'R') {
                    queue.offer(new int[]{i,j,0});
                    visited[i][j] = true;
                }
            }
        }

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int count = current[2];
            if(board[x].charAt(y) == 'G') {
                return count;
            }

            for(int i=0; i<4; i++) {
                int nowx = x;
                int nowy = y;

                while(nowx >=0 && nowy >=0 && nowx < board.length && nowy < board[0].length() && board[nowx].charAt(nowy) != 'D') {
                    nowx += dx[i];
                    nowy += dy[i];
                }
                nowx -= dx[i];
                nowy -= dy[i];

                if(visited[nowx][nowy]) {
                    continue;
                }
                visited[nowx][nowy] = true;
                queue.offer(new int[]{nowx,nowy,count+1});
            }
        }
        return -1;
    }
}