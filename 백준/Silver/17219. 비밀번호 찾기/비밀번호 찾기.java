import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String[] nms = br.readLine().split(" ");
        int n = Integer.parseInt(nms[0]);
        int m = Integer.parseInt(nms[1]);
        HashMap<String, String> webSitePaasWords = new HashMap<>();
        for (int i = 0; i <n; i++) {
            String[] input = br.readLine().split(" ");
            webSitePaasWords.put(input[0],input[1]);
        }
        for (int i = 0; i < m; i++) {
            String siteName = br.readLine();
            System.out.println(webSitePaasWords.get(siteName));
        }
    }
}
