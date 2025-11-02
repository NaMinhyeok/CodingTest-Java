import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] map = new int[n];
        for(int i = 0; i < n; i++){
            map[i] = Integer.parseInt(br.readLine());
        }
        
        int now = 0;
        int result = 0;
        
        for(int i = 1; i <= m; i++){
            int dice = Integer.parseInt(br.readLine());
            now += dice;
            
            if(now >= n-1){
                result = i;
                break;
            }
            
            now += map[now];
            
            if(now < 0){
                now = 0;
            }
            
            if(now >= n-1){
                result = i;
                break;
            }
        }
        
        System.out.println(result);
    }
}