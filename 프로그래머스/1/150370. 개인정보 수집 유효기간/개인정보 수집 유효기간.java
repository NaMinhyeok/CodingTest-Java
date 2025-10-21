import java.util.*;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        Date now = new Date(today);
        
        // 21.01.05 수집 -> 12달 -> 22.01.04 보관 / 22.01.05 파기
        Map<String,Integer> species = new HashMap<String,Integer>();
        for(String s: terms) {
            String[] arr = s.split(" ");
            species.put(arr[0],Integer.parseInt(arr[1]));
        }
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<privacies.length; i++) {
            String[] splited = privacies[i].split(" ");
            Date destroyDate = new Date(splited[0]).calcExpired(species.get(splited[1]));
            if(destroyDate.isExpired(now)) {
                answer.add(i+1);                
            }
        }
        
        return answer;
    }
    
    class Date {
        int year;
        int month;
        int day;
        
        public Date(String dateString) {
            String[] arr = dateString.split("[.]");
            this.year = Integer.parseInt(arr[0]);
            this.month = Integer.parseInt(arr[1]);
            this.day = Integer.parseInt(arr[2]);
        }
        
        public Date(int year,int month,int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
        
        public Date calcExpired(int term) {
            if(term > 12 ) {
                this.year += term / 12;
                term = term % 12;
            }
            if(month + term > 12) {
                this.year += 1;
                this.month = this.month + term - 12;
                return new Date(year, month, day);
            }
            this.month += term;
            return new Date(year, month, day);
        }
        
        public boolean isExpired(Date other) {
            if (year < other.year) {
                return true;
            } else if (year == other.year && month < other.month) {
                return true;
            } else if (year == other.year && month == other.month && day <= other.day) {
                return true;
            } else {
                return false;
            }
        }
    }
}