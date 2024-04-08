import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //문제
        //매일 아침, 세준이는 학교에 가기 위해서 차를 타고 D킬로미터 길이의 고속도로를 지난다. 이 고속도로는 심각하게 커브가 많아서 정말 운전하기도 힘들다. 어느 날, 세준이는 이 고속도로에 지름길이 존재한다는 것을 알게 되었다. 모든 지름길은 일방통행이고, 고속도로를 역주행할 수는 없다.
        //
        //세준이가 운전해야 하는 거리의 최솟값을 출력하시오.
        //
        //입력
        //첫째 줄에 지름길의 개수 N과 고속도로의 길이 D가 주어진다. N은 12 이하인 양의 정수이고, D는 10,000보다 작거나 같은 자연수이다. 다음 N개의 줄에 지름길의 시작 위치, 도착 위치, 지름길의 길이가 주어진다. 모든 위치와 길이는 10,000보다 작거나 같은 음이 아닌 정수이다. 지름길의 시작 위치는 도착 위치보다 작다.
        //
        //출력
        //세준이가 운전해야하는 거리의 최솟값을 출력하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int[] dist = new int[10001];
        ArrayList<shortcut> list[] = new ArrayList[10000+1];
        // 거리 최댓값으로
        Arrays.fill(dist,Integer.MAX_VALUE);
        for(int i=0; i<10001; i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            // 지름길이면 리스트에 추가
            if(end-start > distance){
                list[end].add(new shortcut(start,distance));
            }
        }
        dist[0] = 0;
        for(int i=1; i<=D; i++){
            if(!list[i].isEmpty()){
                for(shortcut s : list[i]){
                    // 지름길로 가는게 더 짧을 때 저장
                    if(dist[s.start]+s.distacne > dist[i]){
                        continue;
                    }
                    dist[i] = Math.min(dist[i-1]+1,dist[s.start]+s.distacne);
                }
                continue;
            }
            //지름길이 없으면 이전거리 +1 저장
            dist[i] = dist[i-1] + 1;
        }
        bw.write(String.valueOf(dist[D]));
        bw.flush();
    }
    static class shortcut{
        int start;
        int distacne;
        shortcut(int start,int distance){
            this.start = start;
            this.distacne = distance;
        }
    }
}
