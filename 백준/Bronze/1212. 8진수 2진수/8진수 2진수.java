import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 48 + 8 + 4 = 60 = 314 = 1111001
        StringBuilder sb = new StringBuilder();
        String eight = br.readLine();
        for(int i=0; i<eight.length(); i++) {
            int number = eight.charAt(i)-'0';
            if(number >= 4) {
                sb.append(1);
                number -= 4;
            }else {
                sb.append(0);
            }
            if(number >= 2) {
                sb.append(1);
                number -= 2;
            }else {
                sb.append(0);
            }
            if(number == 1) {
                sb.append(1);
                number -= 1;
            }else{
                sb.append(0);
            }
        }
        while(sb.charAt(0)=='0' && sb.length()>1){
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
    }
}
