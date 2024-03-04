class Solution {
    public int solution(int a, int b, int c) {
        // 세 숫자가 같으면 a+b+c
        // 두개만 같으면 (a + b + c) × (a^2 + b^2 + c^2 )
        // 세 숫자가 모두 같다면 (a + b + c) × (a^2 + b^2 + c^2 ) × (a^3 + b^3 + c^3 )
        int answer = 0;
        if(a != b && a != c && b != c){
            answer = (a+b+c);
        } 
        else if (a == b && a==c && b==c){
            answer = (a+b+c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c);
        }
        else {
            answer = (a+b+c)*(a*a + b*b + c*c);
        }
        return answer;
    }
}