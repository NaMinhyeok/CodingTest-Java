import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        // 듣도 못한 사람의 수 N
        // 보도 못한 사람의 수 M
        // 둘째 줄 부터 N개의 줄에 걸쳐 듣도 못한사람의 이름
        // N+2 째 줄부터 보도 못한사람의 이름
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int m = 0;
        String s = br.readLine();
        String[] split = s.split(" ");
        if (split.length == 2) {
            n = Integer.parseInt(split[0]);
            m = Integer.parseInt(split[1]);
        } else {
            n = Integer.parseInt(split[0]);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n+m; i++) {
            String name = br.readLine();
            map.put(name,map.getOrDefault(name,0)+1);
        }

        List<String> results = map.entrySet().stream()
            .filter(
                it -> it.getValue() > 1
            )
            .map(Map.Entry::getKey)
            .sorted()
            .collect(Collectors.toList());

        System.out.println(results.size());
        results.forEach(System.out::println);
    }
}
