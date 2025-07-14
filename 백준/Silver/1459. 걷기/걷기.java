import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String[] words = word.split(" ");
        long x = Long.parseLong(words[0]);
        long y = Long.parseLong(words[1]);
        long straight = Long.parseLong(words[2]);
        long cross = Long.parseLong(words[3]);
        long weight = 0L;
        if(straight * 2 <= cross) {
            weight = (x+y) * straight;
        } else {
            long min = Math.min(x,y);
            long max = Math.max(x,y);
            long diff = Math.abs(x-y);
            if ( cross <= straight ) {
                if((x+y) % 2 ==0) {
                    weight = max * cross;
                } else {
                    weight = (max - 1) * cross + straight;
                }
            } else {
                weight = min * cross + diff * straight;
            }
        }
        System.out.println(weight);
    }
}