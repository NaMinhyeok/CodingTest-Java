import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] arr = new int[100_000];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: tangerine) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count = 0;
        
        for( Map.Entry<Integer,Integer> entry : map.entrySet()
                                                    .stream()
                                                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            										.collect(Collectors.toUnmodifiableList())) {
            if (count >= k) break;
            count += entry.getValue();
            answer++;
        }
        
        return answer;
    }
}