import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "push_front": {
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "push_back": {
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop_front": {
                    if(deque.isEmpty()) {
                        bw.write("-1\n");
                        break;
                    } else {
                        bw.write(deque.removeFirst()+"\n");
                        break;
                    }
                }
                case "pop_back": {
                    if(deque.isEmpty()) {
                        bw.write("-1\n");
                        break;
                    } else {
                        bw.write(deque.removeLast()+"\n");
                        break;
                    }
                }
                case "size": {
                    bw.write(deque.size()+"\n");
                    break;
                }
                case "empty": {
                    if(deque.isEmpty()) {
                        bw.write("1\n");
                        break;
                    } else {
                        bw.write("0\n");
                        break;
                    }
                }
                case "front": {
                    if(deque.isEmpty()) {
                        bw.write("-1\n");
                        break;
                    } else {
                        bw.write(deque.peekFirst()+"\n");
                        break;
                    }
                }
                case "back": {
                    if(deque.isEmpty()) {
                        bw.write("-1\n");
                        break;
                    } else {
                        bw.write(deque.peekLast()+"\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
    }
}
