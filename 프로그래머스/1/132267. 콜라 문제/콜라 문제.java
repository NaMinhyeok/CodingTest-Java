class Solution {
    public int solution(int a, int b, int n) {
        int bonusCokes = 0;
        while((n/a) > 0) {
            int remain = n % a;
            int bonus = (n/a) * b;
            bonusCokes += bonus;
            n = bonus + remain;
        }
        return bonusCokes;
    }
}