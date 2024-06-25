class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        // brown + yellow 의 약수가 가로세로 길이임
        // (가로 - 2) * (세로 -2) = yellow 이여야됨
        // 넓이 = 브라운 + 옐로
        int area = brown + yellow;
        // 최소 3이상이여야함 한 변의 길이가
        for(int i=3; i<=area; i++){
            int col = i;
            int row = area / i;
            if(row < 3){
                continue;
            }
            //가로의 길이가 세로의 길이보다 같거나 길어야함
            if(row>=col){
                if((row - 2) * (col - 2) == yellow){
                    answer = new int[] {row,col};
                    break;
                }
            }
            
        }
        return answer;
    }
}