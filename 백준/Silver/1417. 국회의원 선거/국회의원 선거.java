import java.io.*;

public class Main {

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int maxValue = 0;
        int count = 0;
        int maxIndex = 0;
        for(int i=0; i<N; i++) {
           numbers[i] = Integer.parseInt(br.readLine());
        }
        
        if(N==1) {
           System.out.println("0");
        }
        
        while(N>1) {
           
           for(int i=1; i<N; i++) {
               if(numbers[i] > maxValue) {
                  maxValue = numbers[i];
                  maxIndex = i;
               }
            }
           
           if(numbers[0] > maxValue) {
              System.out.println(count);
              break;
           } else if(numbers[0] <= maxValue) {
              numbers[0]++;
              numbers[maxIndex]--;
              maxValue--;
              count++;
           } 
        }
   }
}