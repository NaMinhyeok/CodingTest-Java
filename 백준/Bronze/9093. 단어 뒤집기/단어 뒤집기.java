import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String str = br.readLine()+'\n';
            Stack<Character> stack = new Stack<>();
            for(char c : str.toCharArray()) {
                if(c ==' ' || c=='\n'){
                    while(!stack.isEmpty()){
                        bw.write(stack.pop());
                    }
                    bw.write(c);
                } else {
                    stack.push(c);
                }
            }
        }
        bw.flush();
    }
}