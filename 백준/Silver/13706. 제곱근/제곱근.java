import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //문제
        //정수 N이 주어졌을 때, N의 제곱근을 구하는 프로그램을 작성하시오.
        //
        //입력
        //첫째 줄에 양의 정수 N이 주어진다. 정수 N의 제곱근은 항상 정수이며, N의 길이는 800자리를 넘지 않는다.
        //
        //출력
        //첫째 줄에 정수 N의 제곱근을 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(N.sqrt()));
        bw.flush();
        bw.close();
    }
}