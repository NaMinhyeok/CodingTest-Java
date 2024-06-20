import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        // 그냥 전부 다 100이 넘어갈때까지 더한다음에 시점을 저장하기?
        // 그걸 큐에 저장하기
        for(int i=0; i<progresses.length; i++){
            int count=0;
            while(progresses[i]<100){
                progresses[i] += speeds[i];
                count++;
            }            
            q.offer(count);
        }
        // 처음꺼 poll한다음에 그 poll보다 큰값 만날때까지 count늘려서 저장하기?
        while(!q.isEmpty()){
            int num = q.poll();
            int count = 1;
            while(!q.isEmpty() && num >= q.peek()){
                q.poll();
                count++;
            }
            list.add(count);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}