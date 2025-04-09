import java.util.ArrayDeque;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solution(5, 2));
    }

    // 이 부분을 변경해서 실행해보세요.
    private static int solution(int N, int K) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i=1; i<=N; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {
            for(int i=0; i<K-1; i++) {
                deque.addLast(deque.pollFirst());
            }
            deque.pollFirst();
        }

        return deque.pollFirst();
    }

}