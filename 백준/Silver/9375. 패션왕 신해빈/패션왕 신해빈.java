import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            Map<String, Integer> map = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for(int j=0; j<N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();
                if(map.containsKey(type)) {
                    map.put(type,map.get(type)+1);
                } else {
                    map.put(type,1);
                }
            }
            int result = 1;
            for(int count : map.values()) {
                result *= (count+1);
            }
            System.out.println(result-1);
        }
    }
}