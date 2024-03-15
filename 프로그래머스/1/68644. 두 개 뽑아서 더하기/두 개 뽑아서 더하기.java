import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=numbers.length-1; j>i; j--){
                if(list.contains(numbers[i]+numbers[j])==false){
                    list.add(numbers[i]+numbers[j]);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}