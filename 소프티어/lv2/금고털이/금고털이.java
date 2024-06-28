import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        // 무게당 가격이 높은 순으로 sort 하고, W가 가득찰때까지 담기
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            list.add(new int[]{M,P});
        }
        Collections.sort(list,(o1,o2)->o2[1]-o1[1]);
        int max = 0;
        for(int[] item : list){
            if(W<=item[0]){
                max += W * item[1];
                break;
            } else {
                max += item[0] * item[1];
                W -= item[0];
            }
        }
        System.out.print(max);
    }
}
