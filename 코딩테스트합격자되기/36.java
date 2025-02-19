import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        int[][] graph = {{0, 1, 9}, {0, 2, 3}, {1, 0, 5}, {2, 1, 1}};
        System.out.println(Arrays.toString(solution(graph, 0, 3)));
        int[][] graph2 = {{0, 1, 1}, {1, 2, 5}, {2, 3, 1}};
        System.out.println(Arrays.toString(solution(graph2, 0, 4)));
    }

    // 이 부분을 변경해서 실행해보세요.
    public static int[] solution(int[][] graph, int start, int n) {

    }

}