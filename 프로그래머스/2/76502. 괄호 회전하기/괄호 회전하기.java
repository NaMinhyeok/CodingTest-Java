import java.util.*;

class Solution {
    public int solution(String s) {
        // s + s 절반까지 오면 
        // [](){}[](){} 여기서 }[](){ 까지 확인
        Map<Character, Character> map = new HashMap<>();
        String appended = s + s;
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        
        int count = 0;
        for(int i=0; i<s.length(); i++) { // 출발점을 i 로 잡고 appended의 charAt을 s의 length 만큼 넣어보자
            ArrayDeque<Character> stack = new ArrayDeque<>();
            boolean valid = true;
            for(int j=i; j<i+s.length(); j++) {
                if(map.containsKey(appended.charAt(j))) {
                    stack.addLast(appended.charAt(j));
                } else if(!stack.isEmpty() && map.get(stack.peekLast()) == appended.charAt(j)) {
                    stack.pollLast();
                } else {
                    valid = false;
                    break;
                }
            }
            if(stack.isEmpty() & valid) count++;
        }
        return count;
    }
}