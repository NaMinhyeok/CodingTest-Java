class Solution {
    static int count = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers,target,0,0);
        answer = count;
        return answer;
    }
    private static void dfs(int[] numbers,int target,int index, int sum){
        if(index == numbers.length){
            if(sum == target){
                count++;
            }
            return;
        }
        dfs(numbers,target,index+1,sum+numbers[index]);
        dfs(numbers,target,index+1,sum-numbers[index]);
    }
}