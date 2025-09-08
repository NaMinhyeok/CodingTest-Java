import java.util.*;

public class Solution {
    public int solution(int n) {
        // n은 도달해야하는 지점
        // 5000 2500 1250 575   +1
        // 574 287	            +1
        // 143                  +1
        // 72 36 18 9           +1
        // 4 2 1                +1
        
        int count = 0;
        while(n>0) {
            if (n%2 == 1) {
                count++;
            } 
            n /= 2;
        }
        return count;
    }
}