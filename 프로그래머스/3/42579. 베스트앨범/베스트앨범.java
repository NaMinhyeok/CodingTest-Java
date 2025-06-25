import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Genre> lists = new ArrayList<Genre>();
        List<Integer> answer = new ArrayList<>();
        Map<String,Integer> genresTotalCount = new HashMap<String,Integer>();
        for(int i=0; i<genres.length; i++) {
            lists.add(new Genre(i, genres[i], plays[i]));
            genresTotalCount.put(genres[i],genresTotalCount.getOrDefault(genres[i],0)+plays[i]);
        }
        genresTotalCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .forEach(entry-> {
                     lists.stream()
                     .filter(it -> it.getType().equals(entry.getKey()))
                     .sorted(Comparator.comparing(Genre::getId))
                     .sorted(Comparator.comparing(Genre::getCount).reversed())
                     .limit(2)
                     .forEach(it -> answer.add(it.getId()));
});
        int[] arr= new int[answer.size()];
        for(int i=0; i<answer.size(); i++) {
            arr[i] = answer.get(i);
        }
        return arr;
    }
    
    static class Genre {
        private int id;
        private String type;
        private int count;
        
        public Genre(int id, String type, int count) {
            this.id = id;
            this.type = type;
            this.count = count;
        }
        
        public int getId() {
            return this.id;
        }
        
        public String getType() {
            return this.type;
        }
        
        public int getCount() {
            return this.count;
        }
    }
    
 }