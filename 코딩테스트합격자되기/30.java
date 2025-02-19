import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[][] operations1 = {{0, 0, 1}, {0, 1, 2}, {1, 1, 2}};
        System.out.println(Arrays.toString(solution(3, operations1)));
        int[][] operations2 = {{0, 0, 1}, {1, 1, 2}, {0, 1, 2}, {1, 0, 2}};
        System.out.println(Arrays.toString(solution(3, operations2)));
    }


    private static Boolean[] solution(int k, int[][] operation) {

    }

}