import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[][] graph1 = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3, 7}, {4, 8}, {5, 8}, {6, 9}, {7, 9}};
        System.out.println(Arrays.toString(solution(graph1, 1, 9)));
        int[][] graph2 = {{1, 3}, {3, 4}, {3, 5}, {5, 2}};
        System.out.println(Arrays.toString(solution(graph2, 1, 5)));
    }

    private static int[] solution(int[][] graph, int start, int n) {

    }

}