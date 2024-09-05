import java.io.*;
import java.util.*;

public class Main {
    public static int zeroCount = 0;
    public static int negativeOneCount = 0;
    public static int positiveOneCount = 0;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        partition(0, 0, N);

        System.out.println(negativeOneCount);
        System.out.println(zeroCount);
        System.out.println(positiveOneCount);
    }

    private static void partition(int row, int col, int size) {
        if (sameNumberCheck(row, col, size)) {
            if (arr[row][col] == -1) {
                negativeOneCount++;
                return;
            }
            if (arr[row][col] == 1) {
                positiveOneCount++;
                return;
            }
            if (arr[row][col] == 0) {
                zeroCount++;
                return;
            }
        }

        int newSize = size / 3;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row, col + newSize * 2, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        partition(row + newSize, col + newSize * 2, newSize);
        partition(row + newSize * 2, col, newSize);
        partition(row + newSize * 2, col + newSize, newSize);
        partition(row + newSize * 2, col + newSize * 2, newSize);
    }

    private static boolean sameNumberCheck(int row, int col, int size) {
        int arrNum = arr[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arrNum != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}