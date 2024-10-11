import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        int zeroCount = 0;
        int sameCount = 0;
        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            list.add(lotto);
        }

        for(int winNum : win_nums) {
            if(list.contains(winNum)) {
                sameCount++;
            }
        }
        answer[0] = calcRank(sameCount + zeroCount);
        answer[1] = calcRank(sameCount);
        return answer;
    }

    public static int calcRank(int count) {
        if(count == 2) {
            return 5;
        }
        if(count == 3) {
            return 4;
        }
        if(count == 4) {
            return 3;
        }
        if(count == 5) {
            return 2;
        }
        if(count == 6) {
            return 1;
        }
        return 6;
    }
}