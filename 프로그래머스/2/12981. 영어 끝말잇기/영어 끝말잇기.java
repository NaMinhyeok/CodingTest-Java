import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i=1; i<words.length; i++) {
            String now = words[i];
            String last = words[i-1];
            if(!list.contains(words[i]) && (now.charAt(0) == last.charAt(last.length()-1))) {
                            list.add(words[i]);
            } else {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }
        return answer;
    }
}