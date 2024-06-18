import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            //1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
            //2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
            //3: 스택에 들어있는 정수의 개수를 출력한다.
            //4: 스택이 비어있으면 1, 아니면 0을 출력한다.
            //5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
            // Java 11에서는 switch case 의 람다식이 허용되지 않아서 실행 불가
//            switch (num) {
//                case 1 -> stack.push(Integer.parseInt(st.nextToken()));
//                case 2 -> {
//                    if(stack.isEmpty()) {
//                        bw.write("-1"+"\n");
//                    } else {
//                        bw.write(String.valueOf(stack.pop())+"\n");
//                    }
//                }
//                case 3 -> bw.write(String.valueOf(stack.size())+"\n");
//                case 4 -> {
//                    if(stack.isEmpty()) {
//                        bw.write("1"+"\n");
//                    } else {
//                        bw.write("0"+"\n");
//                    }
//                }
//                case 5 -> {
//                    if(stack.isEmpty()) {
//                        bw.write("-1"+"\n");
//                    } else {
//                        bw.write(String.valueOf(stack.peek())+"\n");
//                    }
//                }
//            }
            switch (num) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                case 3:
                    bw.write(stack.size() + "\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.peek() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
    }
}