import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[][] graph1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        System.out.println(Arrays.toString(solution(graph1, 1, 5)));
        int[][] graph2 = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {5, 6}};
        System.out.println(Arrays.toString(solution(graph2, 1, 6)));
    }

    private static int[] solution(int[][] graph, int start, int n) {

    }

}