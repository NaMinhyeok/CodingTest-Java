import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        Iterator<Integer> iter = map.values().iterator();

        while (iter.hasNext()) {
            answer *= iter.next().intValue() + 1;
        }
        
        return answer-1;
    }
}