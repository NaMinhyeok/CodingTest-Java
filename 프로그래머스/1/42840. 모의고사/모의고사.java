import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int idx = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int answer: answers) {
            if(arr[0][idx%5] == answer) {
                count1++;
            }
            if(arr[1][idx%8] == answer) {
                count2++;
            }
            if(arr[2][idx%10] == answer) {
                count3++;
            }
            idx++;
        }
        int max = Math.max(count1, Math.max(count2,count3));
        List<Integer> list = new ArrayList<>();
        if(max == count1) {
            list.add(1);
        }
        if(max == count2) {
            list.add(2);
        }
        if(max == count3) {
            list.add(3);
        }
        return list;
    }
}