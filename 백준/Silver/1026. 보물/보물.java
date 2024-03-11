import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        //문제
        //옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
        //
        //길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
        //
        //S = A[0] × B[0] + ... + A[N-1] × B[N-1]
        //
        //S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
        //
        //S의 최솟값을 출력하는 프로그램을 작성하시오.
        //
        //입력
        //첫째 줄에 N이 주어진다. 둘째 줄에는 A에 있는 N개의 수가 순서대로 주어지고, 셋째 줄에는 B에 있는 수가 순서대로 주어진다. N은 50보다 작거나 같은 자연수이고, A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.
        //
        //출력
        //첫째 줄에 S의 최솟값을 출력한다.

        //근데 이렇게 구현하면 B까지 건드리는건데 ㅠ 다른방법 구현 생각해야할듯
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        StringTokenizer st_a = new StringTokenizer(br.readLine());
        StringTokenizer st_b = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            A.add(Integer.parseInt(st_a.nextToken()));
            B.add(Integer.parseInt(st_b.nextToken()));
        }
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());
        for(int i=0; i<n; i++){
            sum += A.get(i)*B.get(i);
        }
        System.out.println(sum);
    }
}