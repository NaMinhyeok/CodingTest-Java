import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int numCount = Integer.parseInt(br.readLine());
            List<Integer> stocks = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

            int max = 0;
            long gain = 0;
            for (int j = stocks.size()-1; j >=0; j--) {
                max = Math.max(max, stocks.get(j));
                if(stocks.get(j) < max) {
                    gain += max - stocks.get(j);
                }
            }
            System.out.println(gain);
        }
    }
}
