import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        Stack<Character> resultStack = new Stack<>();
        for(char c : str.toCharArray()) {
            stack.push(c);
        }
        // 현재 커서 위치
        int now = str.length();
        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // hello
            // L 은 왼쪽으로 커서 한칸
            // 이 때 stack2에 옮겨담기
            // D 는 오른쪽으로 커서 한칸
            // 이 때 stack에 옮겨담기
            // B 는 backspace
            // 이 때는 stack에서 그냥 pop
            // P 는 다음에 오는 char 값 추가
            // 이 때는 stack에 push
            switch(st.nextToken()){
                case "L" -> {
                    if(!stack.isEmpty()){
                        resultStack.push(stack.pop());
                    }
                }
                case "D" -> {
                    if(!resultStack.isEmpty()){
                        stack.push(resultStack.pop());
                    }
                }
                case "B" -> {
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }
                case "P" -> {
                    stack.push(st.nextToken().charAt(0));
                }
            }
        }
        while(!stack.isEmpty()){
            resultStack.push(stack.pop());
        }
        while(!resultStack.isEmpty()){
           bw.write(resultStack.pop());
        }
        bw.flush();
    }
}
