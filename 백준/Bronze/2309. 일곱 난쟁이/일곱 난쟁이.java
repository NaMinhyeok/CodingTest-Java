import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        int x = -1;
        int y = -1;
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        // 합산이 100이 되면 됨 그러면 전체합에서 idx 2개를 빼면되지않나
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            for(int j=arr.length-1; j>i; j--) {
                if(arr[i]+arr[j]==sum-100) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(i==x || i==y) {
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
