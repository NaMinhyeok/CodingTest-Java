import java.util.*;

class Solution {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    
    static class Node {
        int x,y;
        
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public int solution(int[][] maps) {
        ArrayDeque<Node> queue = new ArrayDeque<>();
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] dist = new int[n][m];
        
        dist[0][0] = 1;
        queue.addLast(new Node(0,0));
        visited[0][0] = true;
        while(!queue.isEmpty()) {
            Node now = queue.pollFirst();
            for(int i=0; i<4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= n || ny >= m ) {
                    continue;
                }
                if(maps[nx][ny] == 0) {
                    continue;
                }
                
                if(visited[nx][ny] == false) {
                	visited[nx][ny] = true;    
                    queue.addLast(new Node(nx,ny));
                    dist[nx][ny] = dist[now.x][now.y] + 1;
                }
            }
        }
        
        return dist[n-1][m-1] != 0 ? dist[n-1][m-1] : -1;
    }
    
}