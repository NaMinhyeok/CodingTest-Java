import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] boards = new int[100][100];
        for(int i=0; i<4; i++) {
        String[] points = br.readLine().split(" ");
            int x1 = Integer.parseInt(points[0]);
            int y1 = Integer.parseInt(points[1]);
            int x2 = Integer.parseInt(points[2]);
            int y2 = Integer.parseInt(points[3]);

            for(int x = x1; x < x2; x++) {
                for(int y = y1; y < y2; y++) {
                    boards[x][y] = 1;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(boards[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
