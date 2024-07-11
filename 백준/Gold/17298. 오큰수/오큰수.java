import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<seq.length; i++) {
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i]){
                seq[stack.pop()] = seq[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            seq[stack.pop()] = -1;
        }
        for(int i = 0; i<seq.length; i++) {
            bw.write(String.valueOf(seq[i])+" ");
        }
        bw.flush();
    }
}
