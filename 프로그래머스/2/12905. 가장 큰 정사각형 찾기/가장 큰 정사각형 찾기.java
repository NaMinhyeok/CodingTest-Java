class Solution {
    public int solution(int [][]board) {
        int answer = Integer.MIN_VALUE;
        int N = board.length;
        int M = board[0].length;
        
        // 나의 왼쪽, 위, 왼쪽위 대각선이 모두 N라면 N+1
        
        // 0 1 1 1
        // 1 1 2 2
        // 1 2 2 3
        // 0 0 1 0
        for(int i=1; i<N; i++) {
            for(int j=1; j<M; j++) {
                if(board[i][j] > 0) {
                    board[i][j] += Math.min(board[i-1][j], Math.min(board[i-1][j-1], board[i][j-1]));
                }
            }
        }
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                answer = Math.max(board[i][j],answer);
            }
        }

        return answer * answer;
    }
}