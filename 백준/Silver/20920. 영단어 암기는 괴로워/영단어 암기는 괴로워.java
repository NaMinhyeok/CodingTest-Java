import java.io.*;
import java.util.*;

public class Main {
    private static int[][] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> word = new HashMap<>();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.length()>=M) {
                word.putIfAbsent(str,1);
                if(word.containsKey(str)){
                    word.replace(str,word.get(str)+1);
                }
            }
        }
        List<String> list = new ArrayList<>(word.keySet());
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 반환값 음수이면 o1보다 o2를 앞에 위치시킴
                // 반환값이 0 이면 순서 바꾸기 x
                // 반환값이 1이면 o2를 o1앞에 위치시킴
                if ((word.get(o1)!=word.get(o2))){ //만약 등장횟수가 같지않다면
                    return word.get(o2)-word.get(o1); // 등장횟수 내림차순으로 정렬 밸류 값이 더 큰게 앞으로 오게
                }
                if (o1.length()!=o2.length()){
                    return o2.length()-o1.length(); // 길이 내림차순
                }
                return o1.compareTo(o2); // 사전순
            }
        };
        Collections.sort(list,comparator);
        for (String s : list) {
            bw.write(s+"\n");
        }
        bw.flush();
    }
}
