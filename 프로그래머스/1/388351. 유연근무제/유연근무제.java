import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        Set<Integer> results = new HashSet<>();
        for(int i=0; i<7; i++) {
            Day day = Day.of(startday+i);
            if(day == Day.SAT || day == Day.SUN) {
                continue;
            }
            for(int j=0; j<timelogs.length; j++) {
                Time 출근시간 = new Time(timelogs[j][i]);
                Time 예정시간 = new Time(schedules[j]);
                if(출근시간.isOver(예정시간)) {
                    results.add(j);
                }
            }
        }
        return schedules.length - results.size();
    }
    
    static class Time {
        int hour;
        int min;
        
        public Time(int time) {
            this.hour = time/100;
            this.min = time%100;
        }
        
        public boolean isOver(Time other) {
            int h = this.hour;
            int m = this.min;
            if (m < 10) {
                h -= 1;
                m = m + 50;
            } else {
                m -= 10;
            }

            if (h > other.hour) return true;
            if (h == other.hour && m > other.min) return true;
            return false;
        }
    }
    
    public enum Day {
        MON(1),
        TUE(2),
        WED(3),
        THU(4),
        FRI(5),
        SAT(6),
        SUN(7);

        private final int num;

        Day(int num) {
            this.num = num;
        }
        
        public static Day of(int num) {
            int idx = ((num - 1) % 7 + 7) % 7;
            return Day.values()[idx];
        }

        public int getNum() {
            return num;
        }
    }
}