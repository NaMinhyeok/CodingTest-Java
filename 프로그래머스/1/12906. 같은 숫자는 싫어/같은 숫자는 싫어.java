import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(0,arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                answer.add(arr[i]);
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        return answer;
    }
}