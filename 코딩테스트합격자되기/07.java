import java.util.HashMap;
import java.util.HashSet;

/*
* 문제 출저 : https://school.programmers.co.kr/learn/courses/30/lessons/49994?language=java
* */

class Solution {
    private static final HashMap<Character, int[]> location = new HashMap<>();

    private static boolean isMove(int nowX, int nowY) {
        return 0 <= nowX && nowX < 11 && 0 <= nowY && nowY < 11;
    }

    private static void initLocation() {
        location.put('U', new int[]{0,1});
        location.put('D', new int[]{0,-1});
        location.put('L', new int[]{-1,0});
        location.put('R', new int[]{1,0});
    }

    public int solution(String dirs) {
        initLocation();
        int x=5;
        int y=5;

        HashSet<String> answer = new HashSet<>();

        for(int i=0; i<dirs.length(); i++) {
            int[] offsets = location.get(dirs.charAt(i));
            int nowx = x + offsets[0];
            int nowy = y + offsets[1];
            if (!isMove(nowx, nowy)) {
                continue;
            }
            answer.add(x + " " + y + " " + nowx + " " + nowy);
            answer.add(nowx + " " + nowy + " " + x + " " + y);

            x = nowx;
            y = nowy;
        }
        return answer.size()/2;
    }

}