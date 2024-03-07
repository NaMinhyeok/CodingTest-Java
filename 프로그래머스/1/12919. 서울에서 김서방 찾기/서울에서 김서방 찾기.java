import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<seoul.length; i++){
            arr.add(seoul[i]);
        }
        int index = arr.indexOf("Kim");
        answer = "김서방은 " + index + "에 있다";
        return answer;
    }
}