class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] num = new int[3];
        char[] arr = dartResult.toCharArray();
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '1' && arr[i+1] == '0'){
                num[index] = 10;
                index++;
                i++;
            } else if (arr[i] >= '0' && arr[i] <= '9') {
                num[index] = Integer.parseInt(String.valueOf(arr[i]));
                index++;
            }
            switch (arr[i]) {
                case 'S' -> {
                    num[index-1] = num[index - 1];
                }
                case 'D' -> {
                    num[index-1] *= num[index-1];
                }
                case 'T' -> {
                    num[index-1] *= num[index-1] * num[index-1];
                }
                case '*' -> {
                    if(index==1){
                        num[index-1] *= 2;
                    } else {
                        num[index-1] = num[index-1]*2;
                        num[index-2] = num[index-2]*2;
                    }
                }
                case '#' -> {
                    num[index-1] *= -1;
                }
            }
        }
        answer = num[0] + num[1] + num[2];
        return answer;
    }
}