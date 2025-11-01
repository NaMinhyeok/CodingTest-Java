import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int i = 0;
        int j = 0;
        String temp = "";
        String[] channels = new String[n];

        for (int k = 0; k < n; k++) {
            channels[k] = br.readLine();
        }
        
        while (!channels[0].equals("KBS1")) {
            if (!channels[i].equals("KBS1")) {
                sb.append("1");
                i++;

            } else {
                sb.append("4");
                temp = channels[i];
                channels[i] = channels[i - 1];
                channels[i - 1] = temp;
                i--;
            }

        }
        
        while (!channels[1].equals("KBS2")) {
            if (!channels[j].equals("KBS2")) {
                sb.append("1");
                j++;

            } else {
                sb.append("4");
                temp = channels[j];
                channels[j] = channels[j - 1];
                channels[j - 1] = temp;
                j--;
            }
        }
        
        System.out.println(sb);
    }
}