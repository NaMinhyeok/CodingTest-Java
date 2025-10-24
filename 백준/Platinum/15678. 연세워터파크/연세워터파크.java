import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Stone {
        int idx;
        long val;

        public Stone(int idx, long val) {
            this.idx = idx;
            this.val = val;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        PriorityQueue<Stone> pq = new PriorityQueue<>((o1, o2) -> Long.compare(o2.val,o1.val));

        long max = Long.MIN_VALUE;

        for (int i = 1; i <= N; i++) {
            while (!pq.isEmpty() && pq.peek().idx < i - D) {
                pq.poll();
            }

            long tmp = 0;
            if (!pq.isEmpty() && pq.peek().val > 0) {
                tmp = pq.peek().val;
            }

            tmp += Long.parseLong(st.nextToken());
            pq.offer(new Stone(i, tmp));
            max = Math.max(tmp, max);
        }

        System.out.println(max);
    }
}