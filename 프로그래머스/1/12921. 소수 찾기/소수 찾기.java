import java.util.*;

class Solution {
    public int solution(int n) {
        if (n < 2) return 0;
        List<Integer> list = new ArrayList<>();
        list.add(2);

        for (int i = 3; i <= n; i += 2) {
            boolean flag = true;
            for (int sosu : list) {
                if (sosu * sosu > i) break; 
                if (i % sosu == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) list.add(i);
        }
        return list.size();
    }
}