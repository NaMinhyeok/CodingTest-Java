import java.util.*;

class Solution {
    
    private static final int HIT = 1;
    private static final int MISS = 5;
    
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayDeque<String> cache = new ArrayDeque<>();
        
        for(String city: cities) {
            city = city.toUpperCase();
            if(cache.contains(city)) {
                answer += HIT;
                cache.remove(city);
                cache.addLast(city);
            } else {
                answer += MISS;
                cache.addLast(city);
                if (cache.size() > cacheSize) {
                    cache.pollFirst();
                }
            }
        }
        return answer;
    }
}