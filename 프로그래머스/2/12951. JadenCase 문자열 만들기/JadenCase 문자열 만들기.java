import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s," ",true);
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            char[] arr = str.toLowerCase().toCharArray();
            if (str.equals(" ")){
                sb.append(str);
            } else {
                for(int i=0; i<arr.length; i++){
                    if(arr[i] >= '0' && arr[i] <= '9') {
                        break;
                    }
                    else if(arr[i] >= 'a' && arr[i] <= 'z') {
                        arr[i] -= 32;
                        break;
                    }
                }
                sb.append(String.valueOf(arr));
            }
        }
        answer = sb.toString();
        return answer;
    }
}