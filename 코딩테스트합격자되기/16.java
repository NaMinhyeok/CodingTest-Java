import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> answer = new ArrayDeque<>();

        int n = progresses.length;
        int[] daysLeft = new int[n];
        for(int i=0; i<n; i++) {
            daysLeft[i] = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
        }
        int count = 0;
        int maxDay = daysLeft[0];

        for(int i=0; i<n; i++) {
            if(daysLeft[i] <= maxDay) {
                count++;
            } else {
                answer.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }
        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}