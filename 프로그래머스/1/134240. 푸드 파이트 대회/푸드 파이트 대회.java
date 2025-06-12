import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        // food[0] = 항상 1
        // food[i] = 음식의 수 food는 항상 정렬된 수
        // 결론적으로 짝수인거만큼 쓸 수 있는거고 나머지는 reverse로 더하면 되는거
        StringBuilder foods = new StringBuilder();
        for(int i=1; i<food.length; i++) {
            int half = food[i]/2;
            for(int j=0; j<half; j++) {
                foods.append(i);
            }
        }
        StringBuilder allFoods = new StringBuilder();
        allFoods.append(foods.toString());
        allFoods.append(0);
        allFoods.append(foods.reverse().toString());
        return allFoods.toString();
    }
}