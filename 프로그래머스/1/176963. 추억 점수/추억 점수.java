import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> maps = new HashMap<>();
        for(int i=0; i<name.length; i++) {
            maps.put(name[i],yearning[i]);
        }
        for(int i=0; i<photo.length; i++) {
            int total = 0;
            for(int j=0; j<photo[i].length; j++) {
                total += maps.getOrDefault(photo[i][j],0);
            }
            answer[i] = total;
        }
        return answer;
    }
}