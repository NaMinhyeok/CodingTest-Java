import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean check = false;
        // <> 안에는 순서 뒤집기 x
        // 공백으로 단어 나누고 단어의 알파벳 뒤집기
        //태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고,
        // '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.
        // 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고, 연속하는 두 단어는 공백 하나로 구분한다.
        // 태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.
        for(char c : str.toCharArray()){
            if(c=='<'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                check = true;
            } else if(c=='>'){
                sb.append(c);
                check = false;
                continue;
            }
            if(check){
                sb.append(c);
            } else {
                if(c == ' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(c);
                    continue;
                } else {
                    stack.push(c);
                }
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
