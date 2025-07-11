import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        
        for(String s: operations) {
            String[] operation = s.split(" ");
            if("I".equals(operation[0])) {
                minHeap.offer(Integer.valueOf(operation[1]));
                maxHeap.offer(Integer.valueOf(operation[1]));
            }
            if("D".equals(operation[0]) && !maxHeap.isEmpty() && !minHeap.isEmpty()) {
                if("1".equals(operation[1])) {
                    minHeap.remove(maxHeap.poll());
                }
                if("-1".equals(operation[1])) {
                    maxHeap.remove(minHeap.poll());
                }
            }
        }
        int min = 0;
        int max = 0;
        if(!minHeap.isEmpty()) {
            min = minHeap.poll();
        }
        if(!maxHeap.isEmpty()) {
            max = maxHeap.poll();
        }
        int[] answer = {max,min};
        return answer;
    }
}