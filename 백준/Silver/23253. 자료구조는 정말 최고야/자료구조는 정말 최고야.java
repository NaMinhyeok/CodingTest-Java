import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nms = br.readLine().split(" ");
        int n = Integer.parseInt(nms[0]);
        int m = Integer.parseInt(nms[1]);
        
        for(int i=0; i<m; i++) {
            int k = Integer.parseInt(br.readLine());
            String[] numStrings = br.readLine().split(" ");
            Stack<Integer> stack = new Stack<Integer>();
            for(String numString: numStrings) {
                if(!stack.isEmpty() && stack.peek() < Integer.parseInt(numString)) {
                    System.out.println("No");
                    return;
                } else {
                    stack.push(Integer.parseInt(numString));    
                }
            }
        }
        System.out.println("Yes");
    }
}