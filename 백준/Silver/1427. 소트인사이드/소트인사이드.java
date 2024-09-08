import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        int n = num.length();

        char[] arr = new char[n];

        for(int i=0; i<n; i++) {
            arr[i] = (num.charAt(i));
        }

        Arrays.sort(arr);

        for(int i=n-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }

}