import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(" ");
        int n = Integer.parseInt(split[0]);
        int l = Integer.parseInt(split[1]);
        int[] waters = new int[n];
        String[] watersSplit = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            waters[i] = Integer.parseInt(watersSplit[i]);
        }
        Arrays.sort(waters);
        double start = waters[0] - 0.5;
        int tapeCount = 1;
        for (int i = 0; i < waters.length; i++) {
            if (start + l < waters[i] + 0.5) {
                start = waters[i] - 0.5;
                tapeCount++;
            }
        }
        System.out.println(tapeCount);
    }
}
