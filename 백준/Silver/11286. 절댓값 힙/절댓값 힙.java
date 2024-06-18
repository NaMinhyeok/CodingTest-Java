import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs){   // 절댓값이 같을 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }
            // 절댓값이 작은 데이터 우선
            return first_abs - second_abs;
        });
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num!=0){
                queue.offer(num);
            } else {
                // num이 0이라면 배열에서 절댓값이 가장 작은 값을 출력하고 제거
                // 배열이 비어있는 경우 0을 출력
                if(queue.isEmpty()){
                    bw.write("0"+"\n");
                } else {
                    bw.write(String.valueOf(queue.poll())+"\n");
                }
            }
        }
        bw.flush();
    }
}