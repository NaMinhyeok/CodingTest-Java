import java.util.*;

public class Solution {

    private static HashMap<Integer,HashMap<String,Integer>> courseMap;

    public String[] solution(String[] orders, int[] course) {
        courseMap = new HashMap<>();
        for(int i: course) {
            courseMap.put(i,new HashMap<>());
        }

        for(String order: orders) {
            char[] orderArray = order.toCharArray();
            Arrays.sort(orderArray);
            comibination(0, orderArray, "");
        }

        ArrayList<String> answer = new ArrayList<>();

        for(HashMap<String,Integer> count: courseMap.values()) {
            count.values()
                .stream()
                .max(Comparator.comparingInt(o -> o))
                .ifPresent(cnt -> count.entrySet()
                    .stream()
                    .filter(entry -> count.equals(entry.getValue()) && cnt > 1)
                    .forEach(entry -> answer.add(entry.getKey())));
        }

        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }

    private static void comibination(int idx, char[] order, String result) {
        if(courseMap.containsKey(result.length())) {
            HashMap<String, Integer> map = courseMap.get(result.length());
            map.put(result, map.getOrDefault(result, 0) + 1);
        }

        for(int i = idx; i<order.length; i++) {
            comibination(i+1, order, result + order[i]);
        }
    }


}