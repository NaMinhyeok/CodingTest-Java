import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
    
    public static boolean isGroupWord(String word) {
        Set<Character> seen = new HashSet<>();  
        char prevChar = '\0';
        
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            
            if (currentChar != prevChar) {
                if (seen.contains(currentChar)) {
                    return false;
                }
                seen.add(currentChar);
                prevChar = currentChar;
            }
        }
        
        return true;
    }
}