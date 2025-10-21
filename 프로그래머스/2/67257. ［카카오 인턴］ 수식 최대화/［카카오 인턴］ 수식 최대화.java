import java.util.*;

class Solution {
    public long solution(String expression) {
        List<String> operators = new ArrayList<>();
        String[][] composites = {{"+","-","*"}, {"+","*","-"}, {"-","+","*"},
                     {"-","*","+"}, {"*","+","-"}, {"*","-","+"}};
        long answer = 0;
        for(char c: expression.toCharArray()) {
            if(c == '-' || c == '*' || c == '+') {
                operators.add(String.valueOf(c));
            }
        }
        String[] numberStrings= expression.split("[-+*]");
        List<Long> numbers = new ArrayList<>();
        for(String number : numberStrings) {
            numbers.add(Long.parseLong(number));
        }
        // numbers.get(operatorIndex) operator numbers.get(opratorIndex+1)
        long max = Long.MIN_VALUE;
        for(int i=0; i<composites.length; i++) {
            List<Long> copiedNumbers = new ArrayList<>(numbers);
            List<String> copiedOperators = new ArrayList<>(operators);
            for(int j=0; j<3; j++) {
                String found = composites[i][j];
                for(int p = 0; p<copiedOperators.size(); p++) {
                    if(copiedOperators.get(p).equals(found)) {
                        long result = calc(copiedNumbers.get(p), found, copiedNumbers.get(p+1));
                        copiedNumbers.remove(p);
                        copiedNumbers.remove(p);
                        copiedOperators.remove(p);
                        copiedNumbers.add(p, result);
                        p--;
                    }
                }
            }
            max = Math.max(max, Math.abs(copiedNumbers.get(0)));
        }
        return max;
        
    }
    private static long calc(long num1, String operator, long num2) {
        if("+".equals(operator)) {
            return num1 + num2;
        }
        if("-".equals(operator)) {
            return num1 - num2;
        }
        if("*".equals(operator)) {
            return num1 * num2;
        }
        throw new IllegalArgumentException();
    }
}