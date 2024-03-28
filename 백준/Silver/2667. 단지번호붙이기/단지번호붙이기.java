import java.io.*;
import java.util.*;

//P2667
public class Main {
    //문제
    private static boolean visited[][];
    private static int[] dx = {1,0,-1,0};
    private static int[] dy = {0,1,0,-1};
    private static int N,count;
    private static int[][] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        A = new int[N][N];
        visited = new boolean[N][N];
        count = 1;
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                A[i][j] = str.charAt(j)-'0';
            }
        }
        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                if(!visited[x][y] && A[x][y]==1){
                    dfs(x,y);
                    resultList.add(count);
                    count = 1;
                }
            }
        }
        Collections.sort(resultList);
        bw.write(resultList.size()+"\n");
        for(int i : resultList){
            bw.write(i+"\n");
        }
        bw.flush();
    }

    private static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int nowx = x+dx[i];
            int nowy = y+dy[i];
            if(nowx<N && nowy<N && nowx>=0 && nowy>=0 && !visited[nowx][nowy] && A[nowx][nowy]==1) {
                count++;
                dfs(nowx,nowy);
            }
        }
    }
    //    private static void bfs(int x, int y,int N){
//        visited[x][y] = true;
//        Queue<int[]> queue = new LinkedList<>();
//        queue.offer(new int[] {x,y});
//        int visitCount = 0;
//        while(!queue.isEmpty()){
//            int now[] = queue.poll();
//            visitCount++;
//            for(int i=0; i<4; i++){
//                int nowx = now[0] + dx[i];
//                int nowy = now[1] + dy[i];
//
//                if(nowx<N && nowy<N && nowx>=0 && nowy>=0){
//                    if(!visited[nowx][nowy]){
//                        queue.offer(new int[] {nowx,nowy});
//                        visited[nowx][nowy] = true;
//                    }
//                }
//            }
//        }
//        resultList.add(visitCount);
//    }
}
