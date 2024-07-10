import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 레이저 만나기 전의 ( 의 갯수만큼 쇠막대기가 늘어남
        int count = 0;
        Stack<Character> stack = new Stack<>();
        // 무조건 stack에는 '(' 밖에 들어가지 않는다 ')'이 들어오면 무조건 pop
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '('){
                stack.push(c);
            } else {
                stack.pop();
                // 이때 레이저인지 쇠막대의 끝인지 구분
                if(str.charAt(i-1)=='('){   // 레이저
                    count += stack.size();  // 레이저가 끊을때는 스택의 길이만큼
                } else {  // 쇠막대
                    count++;    // 쇠막대의 끝에 도달하면 그 때 쇠막대 하나 추가
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
