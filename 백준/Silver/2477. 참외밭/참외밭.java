import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[6];
        int maxWidth = 0;
        int maxHeight = 0;
        int widthIndex = 0;
        int heightIndex = 0;
        int width = 0;
        int height = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<6; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            arr[i] = Integer.parseInt(st.nextToken());
            if(dir==1 || dir==2){
                if(maxWidth < arr[i]){
                    maxWidth = arr[i];
                    widthIndex = i;
                }
            }
            if(dir==3 || dir==4){
                if(maxHeight < arr[i]){
                    maxHeight = arr[i];
                    heightIndex = i;
                }
            }
        }
        if(widthIndex == 0) {
            height = Math.abs(arr[5]-arr[1]);
        } else if (widthIndex == 5) {
            height = Math.abs(arr[0]-arr[4]);
        } else {
            height = Math.abs(arr[widthIndex+1]-arr[widthIndex-1]);
        }
        if(heightIndex == 0) {
            width = Math.abs(arr[5]-arr[1]);
        } else if (heightIndex == 5) {
            width = Math.abs(arr[0]-arr[4]);
        } else {
            width = Math.abs(arr[heightIndex+1]-arr[heightIndex-1]);
        }
        System.out.println(((maxWidth*maxHeight) - (width*height)) * N);
    }
}
