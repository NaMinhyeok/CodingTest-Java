import java.awt.*;
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] arrSort;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arrSort = arr.clone();
        Arrays.sort(arrSort);
        int count = 0;
        for(int i=0; i<N; i++){
            if(!hashMap.containsKey(arrSort[i])){
                hashMap.put(arrSort[i],count++);
            }
        }
        for(int i=0; i<N; i++){
            sb.append(hashMap.get(arr[i])).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}