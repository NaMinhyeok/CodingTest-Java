import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int start=commands[i][0]-1; start<commands[i][1]; start++){
                arr.add(array[start]);
            }
            Collections.sort(arr);
            answer[i] = arr.get((commands[i][2]-1));
        }
        return answer;
    }
}