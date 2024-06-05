import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
        // 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
        // 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
        //
        //입력
        //첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
        //
        //출력
        //입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 벌집 1 7 19 37 61 91
        // 1 * 1                    1
        // 1 + 6 * 2                2
        // 1 + 6 * 3                3
        // 1 + 6 * 6                4
        // 1 + 6 * 10               5
        // 1 + 6 * 15               6
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 1;
        if (n == 1) {
            bw.write("1");
        } else {
            while (range < n) {
                range += 6 * count;
                count++;
            }
            bw.write(String.valueOf(count));
        }
        bw.flush();
    }
}