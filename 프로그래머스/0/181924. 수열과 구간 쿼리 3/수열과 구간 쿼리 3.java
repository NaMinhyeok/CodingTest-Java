class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        System.arraycopy(arr,0,answer,0,arr.length);
        int a,b,temp;
        for(int i=0; i<queries.length; i++){
            a = queries[i][0];
            b = queries[i][1];
            temp = answer[a];
            answer[a] = answer[b];
            answer[b] = temp;
        }
        return answer;
    }
}