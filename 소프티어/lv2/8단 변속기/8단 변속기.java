import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()){
            sb.append(st.nextToken());
        }
        if((sb.toString()).equals("12345678")){
            System.out.print("ascending");
        } else if((sb.toString()).equals("87654321")){
            System.out.print("descending");
        } else {
            System.out.print("mixed");
        }
    }
}
