import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 8; i++) {
            int num = Integer.parseInt(br.readLine());
            map.put(i, num);
        }

        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .limit(5)
            .collect(Collectors.toList());

        int result = 0;
        List<Integer> selectedProblems = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : list) {
            result += entry.getValue();
            selectedProblems.add(entry.getKey());
        }

        selectedProblems.sort(Integer::compareTo);

        System.out.println(result);
        System.out.println(selectedProblems.stream()
            .map(String::valueOf)
            .reduce((a, b) -> a + " " + b)
            .orElse(""));
    }
}
