import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        List<Data> datas = new ArrayList<>();
        for(int i=0; i<data.length; i++) {
            datas.add(new Data(data[i][0], data[i][1], data[i][2], data[i][3]));
        }
        List<Data> analyzedDatas = new Datas(datas).analyze(ext,val_ext,sort_by);
        int[][] answer = new int[analyzedDatas.size()][4];
        for(int i=0; i<analyzedDatas.size(); i++) {
            answer[i][0] = analyzedDatas.get(i).getCode();
            answer[i][1] = analyzedDatas.get(i).getDate();
            answer[i][2] = analyzedDatas.get(i).getMaximum();
            answer[i][3] = analyzedDatas.get(i).getRemain();
        }
        return answer;
    }
    
    static class Data {
        private int code;
        private int date;
        private int maximum;
        private int remain;
        
        public Data(int code, int date,int maximum, int remain) {
            this.code = code;
            this.date = date;
            this.maximum = maximum;
            this.remain = remain;
        }
        
        public int getCode() {
            return this.code;
        }
        
        public int getDate() {
            return this.date;
        }
        
        public int getMaximum() {
            return this.maximum;
        }
        
        public int getRemain() {
            return this.remain;
        }
    }
    
    static class Datas {
        private final List<Data> values;
        
        public Datas(List<Data> datas) {
            this.values = datas;
        }
        
        public List<Data> analyze(String ext, int valExt, String sortOption) {
            Datas temp = new Datas(appliedExt(ext,valExt));
            return temp.appliedSortBy(sortOption);
        }
        
        public List<Data> appliedExt(String ext, int valExt) {
            if(ext.equals("date")) {
                return values.stream()
                    .filter(it -> it.getDate() < valExt)
                    .collect(Collectors.toList());
            }
            if(ext.equals("code")) {
                return values.stream()
                    .filter(it -> it.getCode() < valExt)
                    .collect(Collectors.toList());
            }
            if(ext.equals("maximum")) {
                return values.stream()
                    .filter(it -> it.getMaximum() < valExt)
                    .collect(Collectors.toList());
            }
            if(ext.equals("remain")) {
                return values.stream()
                    .filter(it -> it.getRemain() < valExt)
                    .collect(Collectors.toList());
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        
        public List<Data> appliedSortBy(String sortOption) {
            if(sortOption.equals("code")) {
                return values.stream()
                    .sorted(Comparator.comparing(Data::getCode))
                    .collect(Collectors.toList());
            }
            if(sortOption.equals("date")) {
                return values.stream()
                    .sorted(Comparator.comparing(Data::getDate))
                    .collect(Collectors.toList());
            }
            if(sortOption.equals("maximum")) {
                return values.stream()
                    .sorted(Comparator.comparing(Data::getMaximum))
                    .collect(Collectors.toList());
            }
            if(sortOption.equals("remain")) {
                return values.stream()
                    .sorted(Comparator.comparing(Data::getRemain))
                    .collect(Collectors.toList());
            }
            else {
                throw new IllegalArgumentException();
            }
        }
    }
}