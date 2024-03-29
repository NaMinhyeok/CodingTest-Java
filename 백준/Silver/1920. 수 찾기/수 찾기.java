import java.io.*;
import java.util.*;

public class Main {
    //문제
    //N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
    //
    //입력
    //첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
    //
    //출력
    //M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
    private static int[][] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            boolean find = false;
            int target = Integer.parseInt(st.nextToken());
            int start=0;
            int end = arr.length - 1;
            while(start<=end){
                int midIndex = (start+end)/2;
                int mid = arr[midIndex];
                if(mid>target){
                    end = midIndex-1;
                } else if (mid < target) {
                    start = midIndex + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if(find){
                bw.write(1+"\n");
            } else {
                bw.write(0+"\n");
            }
        }
        bw.flush();
    }
}
