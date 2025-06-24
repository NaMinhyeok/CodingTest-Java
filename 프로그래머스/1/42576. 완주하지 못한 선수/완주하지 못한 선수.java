import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String name: participant) {
            map.put(name, map.getOrDefault(name,0)+1);
        }
        for(String name: completion) {
            if(map.containsKey(name)) {
                if(map.get(name) == 1) {
                    map.remove(name);
                    continue;
                }
                map.put(name,map.get(name)-1);
            }
        }
        Set<String> keys = map.keySet();
        List<String> list = new ArrayList<>(keys);
        return list.get(0);
    }
}