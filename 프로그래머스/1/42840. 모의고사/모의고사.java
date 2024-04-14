import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2,1,2,3,2,4,2,5};
        int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};
        for(int i=0; i<answers.length; i++){
            if(answer1[i%5]==answers[i]){
                score[0]++;
            }
            if(answer2[i%8]==answers[i]){
                score[1]++;
            }
            if(answer3[i%10]==answers[i]){
                score[2]++;
            }
        }
        int[] temp = new int[score.length];
        for(int i=0; i<score.length; i++){
            temp[i] = score[i];
        }
        Arrays.sort(temp);
        for(int i=0; i<score.length; i++){
            if(score[i] == temp[score.length-1]){
                list.add(i+1);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}