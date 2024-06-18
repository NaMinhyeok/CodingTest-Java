import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        //push X: 정수 X를 큐에 넣는 연산이다.
        //pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //size: 큐에 들어있는 정수의 개수를 출력한다.
        //empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
        //front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        //back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push" :
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(String.valueOf(queue.poll())+"\n");
                    }
                    break;
                case "size" :
                    bw.write(String.valueOf(queue.size())+"\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()){
                        bw.write("1"+"\n");
                    } else {
                        bw.write("0"+"\n");
                    }
                    break;
                case "front" :
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(String.valueOf(queue.peek())+"\n");
                    }
                    break;
                case "back" :
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(String.valueOf(queue.peekLast())+"\n");
                    }
                    break;
            }
        }

        bw.flush();
    }
}