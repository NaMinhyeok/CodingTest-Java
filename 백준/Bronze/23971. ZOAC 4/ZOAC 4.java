import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int xCount = (i-1) / (x+1) + 1;
        int yCount = (j-1) / (y+1) + 1;

        System.out.println(xCount * yCount);

    }
}