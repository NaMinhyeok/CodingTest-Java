import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //문제
    //수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
    //
    //입력
    //첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
    //
    //출력
    //총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
    //
    //제한
    //1 ≤ N ≤ 100,000
    //1 ≤ M ≤ 100,000
    //1 ≤ i ≤ j ≤ N
    //예제 입력 1
    //5 3
    //5 4 3 2 1
    //1 3
    //2 4
    //5 5
    //예제 출력 1
    //12
    //9
    //1
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringTokenizer arrSt = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] s = new int[N+1];
        s[0] = 0;
        int[] ans = new int[M];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(arrSt.nextToken());
            s[i+1] = s[i] + arr[i];
        }
        for(int i=0; i<M; i++){
            StringTokenizer range = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(range.nextToken())-1;
            int end = Integer.parseInt(range.nextToken());
            if(start == end){
                ans[i] = arr[i];
            } else {
                ans[i] = s[end]-s[start];
            }
        }
        for(int i=0; i<M; i++){
            bw.write(ans[i]+"\n");
        }
        bw.flush();
    }
}
