import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int x1, y1, r1, x2, y2, r2;
        double d;
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());
            d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            if (x1 == x2 && y1 == y2) {
                if (r1 == r2) {
                    System.out.println(-1);
                } else {
                    System.out.println(0);
                }
            } else {
                if (r1 + r2 < d || (r1 - r2) * (r1 - r2) > d * d) {
                    System.out.println(0);
                } else if (r1 + r2 == d || (r1 - r2) * (r1 - r2) == d * d) {
                    System.out.println(1);
                } else if ((r1 - r2) * (r1 - r2) < d * d && d * d < (r1 + r2) * (r1 + r2)) {
                    System.out.println(2);
                }
            }

        }
    }

}