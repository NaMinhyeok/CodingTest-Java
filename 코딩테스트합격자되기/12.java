import java.util.Stack;

class Solution {

    public static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i=1; i<n; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int top = stack.pop();
                answer[top] = i - top;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            answer[top] = n - 1 - top;
        }
        return answer;
    }

}