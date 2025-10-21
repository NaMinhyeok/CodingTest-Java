class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        // queries -> int[n]{x1,y1,x2,y2}
        // 시계 방향 회전
        
        // initialize
        int[][] board = new int[rows+1][columns+1];
        int initialNum = 1;
        for(int i=1; i<rows+1; i++) {
            for(int j=1; j<columns+1; j++) {
	            board[i][j] = initialNum++;
            }
        }
        
        // rotate 
		// rotate 대상이 될 항목들 찾기
        // rotate count 만큼 반복문 돌면서 넣기
        int rotateCount = queries.length;
        for(int i=0; i<rotateCount; i++) {
            int row1 = queries[i][0];
            int col1 = queries[i][1];
            int row2 = queries[i][2];
            int col2 = queries[i][3];
            
            int prev = board[row1][col1];
            int min = prev;
            
            for(int col = col1+1; col<=col2; col++) {
                int tmp = board[row1][col];
                board[row1][col] = prev;
                prev = tmp;
                min = Math.min(min,board[row1][col]);
            }
                
            for(int row = row1+1; row<=row2; row++) {
                int tmp = board[row][col2];
                board[row][col2] = prev;
                prev = tmp;
                min = Math.min(min,board[row][col2]);
            }
            
            for(int col = col2-1; col>=col1; col--) {
                int tmp = board[row2][col];
                board[row2][col] = prev;
                prev = tmp;
                min = Math.min(min,board[row2][col]);
            }
                
            for(int row = row2-1; row>=row1; row--) {
                int tmp = board[row][col1];
                board[row][col1] = prev;
                prev = tmp;
                min = Math.min(min,board[row][col1]);
            }
            answer[i] = min;
        }

        return answer;
    }
}