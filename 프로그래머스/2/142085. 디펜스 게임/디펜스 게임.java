import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        // enemy를 막아낼 수 있는 최대 라운드
        // enemy[i] + enemy[i+1] ... 의 합산이 n
        // 일단 n에서 까고 PQ에 넣는다 
        // 만약 n - enemy[i] < 0 이면 PQ에서 보상을 해본다
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<enemy.length; i++) {
            pq.add(enemy[i]);
            if (n < enemy[i] && k > 0) {
                n += pq.poll();
                k--;
            }
            n -= enemy[i];
            if (n < 0) {
                break;
            }
            answer++;
        }
        return answer;
    }
}