import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] levels = new int[n];
        for(int i=0; i<n; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for(int i=n-1; i>0; i--) {
            if(levels[i] - levels[i-1] <= 0) {
                count += levels[i-1] - (levels[i]-1);
                levels[i-1] = levels[i]-1;
            }
        }
        System.out.println(count);
    }
}