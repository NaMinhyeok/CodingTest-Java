import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        Arrays.sort(people);
        for(int weight: people) {
            deque.addFirst(weight);
        }
        
        while(!deque.isEmpty()) {
            // 가장 무거운 사람 태우고
            // 
            int capacity = 0;
            capacity = deque.removeFirst();
            
            if(!deque.isEmpty() && capacity + deque.getLast() <= limit) {
                capacity += deque.removeLast();
            }
            answer++;
        }
        
        // last랑 first를 비교해서 크기 비교
        return answer;
    }
}