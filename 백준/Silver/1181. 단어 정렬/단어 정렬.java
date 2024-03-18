import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    //문제
    //알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
    //
    //길이가 짧은 것부터
    //길이가 같으면 사전 순으로
    //단, 중복된 단어는 하나만 남기고 제거해야 한다.
    //
    //입력
    //첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
    //
    //출력
    //조건에 따라 정렬하여 단어들을 출력한다.
    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i=0; i<N; i++){
            arr[i] = br.readLine();
        }
        bubbleSort(arr);
        for(int i=0; i<N; i++){
            if(i!=0){
                if(arr[i].compareTo(arr[i-1])!=0){
                    bw.write(arr[i]+"\n");
                }
            }
            else {
                bw.write(arr[i]+"\n");
            }

        }
        bw.flush();
    }
    static void bubbleSort(String[] array){
        for(int i=0; i< array.length; i++){
            for(int j= array.length-1; j>i; j--){
                if(array[j-1].length() > array[j].length()){
                    String temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
                else if(array[j-1].length() == array[j].length()){
                    if(array[j-1].compareTo(array[j])>0){
                        String temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }
}