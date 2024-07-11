import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[1000001];
        int[] index = new int[N];
        int[] answer = new int[N];
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            index[i] = Integer.parseInt(st.nextToken());
            count[index[i]]++;
        }
        for(int i=0; i<N; i++){
            while(!stack.isEmpty() && count[index[stack.peek()]] < count[index[i]]){
                answer[stack.pop()] = index[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }
        for (int num : answer) {
            bw.write(String.valueOf(num) + " ");
        }
        bw.flush();
    }
}
