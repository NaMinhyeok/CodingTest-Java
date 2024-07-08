import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // Java 11 에서는 스위치 람다문 컴파일 불가
//            switch (st.nextToken()){
//                case "push" -> stack.push(Integer.parseInt(st.nextToken()));
//                case "pop" -> {
//                    if(stack.isEmpty()){
//                        bw.write("-1\n");
//                    } else {
//                        bw.write(stack.pop()+"\n");
//                    }
//                }
//                case "size" -> bw.write(stack.size()+"\n");
//                case "empty" -> {
//                    if(stack.isEmpty()){
//                        bw.write("1\n");
//                    } else {
//                        bw.write("0\n");
//                    }
//                }
//                case "top" -> {
//                    if(stack.isEmpty()){
//                        bw.write("-1\n");
//                    } else {
//                        bw.write(stack.peek()+"\n");
//                    }
//                }
//            }
            switch (st.nextToken()){
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.pop()+"\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size()+"\n");
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "top":
                    if(stack.isEmpty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.peek()+"\n");
                    }
                    break;
            }
            
        }
        bw.flush();
    }
}
