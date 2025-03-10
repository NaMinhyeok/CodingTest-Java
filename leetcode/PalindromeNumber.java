package leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0 ) {
            return false;
        }
        if(String.valueOf(x).equals(reverse(x))) {
            return true;
        }

        return false;
    }

    private String reverse(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
