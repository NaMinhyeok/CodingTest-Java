import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int k = 1;
        
        int count =0;
        
        while (N>0) {
            if(N<k) {
                k = 1;
            }
            N -= k;
            count++;
            k++;
        }
        System.out.println(count);
    }
}
