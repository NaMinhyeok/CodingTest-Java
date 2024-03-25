import java.util.*;

class Solution {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public int solution(int[][] maps) {
        int answer = 0;
        boolean ans;
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        BFS(maps,visited);
        if(!visited[maps.length-1][maps[0].length-1]){
            return -1;
        } else {
            return maps[maps.length-1][maps[0].length-1];
        }
    }
    private static void BFS(int[][] maps, boolean[][] visited){
        int x=0;
        int y=0;
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            for(int i=0; i<4; i++){
                int nowx = now[0] + dx[i];
                int nowy = now[1] + dy[i];
                if(nowx>=0 && nowy>=0 && nowx<maps.length && nowy<maps[0].length){
                    if(!visited[nowx][nowy] && maps[nowx][nowy]!=0){
                        maps[nowx][nowy] = maps[now[0]][now[1]]+1;
                        visited[nowx][nowy] = true;
                        queue.add(new int[] {nowx,nowy});
                    }
                }
            }
        }
    }
}