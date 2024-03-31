import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        String[] arr = new String[]{"A","E","I","O","U"};
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            dfs(list,arr,arr[i]);
        }
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(word)){
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
    static void dfs(ArrayList<String> list,String[] arr, String str){
        if(str.length() > 5){
            return;
        }
        if(!(list.contains(str))){
            list.add(str);
        }
        for(int i=0; i<arr.length; i++){
            dfs(list,arr,str+arr[i]);
        }
    }
}