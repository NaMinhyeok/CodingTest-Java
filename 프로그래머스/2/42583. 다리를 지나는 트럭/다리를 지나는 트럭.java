import java.util.*;

class Solution {
    
    static class Truck {
        int time; // 트럭이 브릿지에 들어갈 시간
        int weight;
        
        public Truck(int time, int weight) {
            this.time = time;
            this.weight = weight;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int capacity = 0;
        int maxCapacity = weight;
        ArrayDeque<Truck> deque = new ArrayDeque<>();
        ArrayDeque<Truck> bridge = new ArrayDeque<>();
        for(int i=0; i<truck_weights.length; i++) {
            deque.addLast(new Truck(0, truck_weights[i]));
        }
        
        int time = 1;
        Truck init = deque.pollFirst();
        bridge.addLast(init);
        capacity = init.weight;
        while(!bridge.isEmpty()) {
            if(time - bridge.peekFirst().time >= bridge_length) {
                Truck deducted = bridge.pollFirst();
                capacity -= deducted.weight;
            }
            if(!deque.isEmpty() && capacity < maxCapacity) {
                Truck candidate = deque.pollFirst();
                if(capacity + candidate.weight <= maxCapacity) {
                    candidate.time = time;
                    capacity += candidate.weight;
                    bridge.addLast(candidate);
                } else {
                    deque.addFirst(candidate);
                }
            }
            time++;
        }
        return time;
    }
}