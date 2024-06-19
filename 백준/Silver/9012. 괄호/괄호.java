import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='('){
                    stack.push('(');
                }
                if(str.charAt(j)==')'){
                    if(!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        stack.push(')');
                        break;
                    }
                }
            }
            if(stack.isEmpty()){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}