import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nms = br.readLine().split(" ");
        int n = Integer.parseInt(nms[0]);
        int m = Integer.parseInt(nms[1]);
        int[] pods = new int[n];
        for(int q=0; q<m; q++) {
            String[] command = br.readLine().split(" ");
            int i = Integer.parseInt(command[0]);
            int j = Integer.parseInt(command[1]);
            int k = Integer.parseInt(command[2]);
            
            for(int p=i-1; p<j; p++) {
                pods[p] = k;
            }
        }
        for(int ball : pods) {
            System.out.print(ball + " ");
        }
    }
}