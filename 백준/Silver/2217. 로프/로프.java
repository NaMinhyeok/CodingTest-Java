import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // k개의 로프를 사용하여 중량이 w인 물체를 들어올릴 때, 각각의 로프에는 모두 고르게 w/k 만큼의 중량이 걸리게 된다.
        // maxWeight = (최소 W) * N
        // 모든 로프를 사용하지 않아도 됨
        int N = Integer.parseInt(br.readLine());    // N개의 로프
        int maxWeight = 0;  // 최대 중량
        Integer[] arr = new Integer[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr,(o1,o2)->o2-o1);
        for(int i=0; i<N; i++){
            int w = arr[i] * (i+1);
            if(maxWeight<w) {
                maxWeight = w;
            }
        }
        System.out.print(maxWeight);
    }
}
