import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Deque<String> firstQueue = new ArrayDeque<String>();
        Deque<String> secondQueue = new ArrayDeque<String>();
        
        for(String s: cards1) {
            firstQueue.addLast(s);
        }
        for(String s: cards2) {
            secondQueue.addLast(s);
        }
        
        for(String s: goal) {
            boolean foundInFirst = !firstQueue.isEmpty() && s.equals(firstQueue.getFirst());
            boolean foundInSecond = !secondQueue.isEmpty() && s.equals(secondQueue.getFirst());
            if(!foundInFirst && !foundInSecond) return "No";
            if(foundInFirst) {
                firstQueue.removeFirst();
                continue;
            }
            if(foundInSecond) {
                secondQueue.removeFirst();
                continue;
            }
            
        }
        
        return answer;
    }
}