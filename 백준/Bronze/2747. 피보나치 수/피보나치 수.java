import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,0);
        list.add(1,1);
        if(n>=2) {
            for (int i = 2; i <= n; i++) {
                int sum =  list.get(i-1) + list.get(i-2);
                list.add(i,sum);
            }
        }
        System.out.println(list.get(n));
    }
}