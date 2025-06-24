import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // N마리 중 N/2마리
        int total = nums.length;
        HashMap<Integer,Integer> poketmons = new HashMap<>();
        for(int num : nums) {
            poketmons.put(num, poketmons.getOrDefault(num,0)+1);
        }
        Set<Integer> keys = poketmons.keySet();
        int 종류의_수 = keys.size();
        if(종류의_수 <= total/2) {
            return 종류의_수;
        }
        return total/2;
    }
}