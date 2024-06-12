

public class IsPalindromeUsingRecusrion {
    public static void main(String[] args) {
        String str = "malayfyyhalam";
        System.out.println(IsPalindrome(str));
    }

    private static boolean IsPalindrome(String str) {
       int n = str.length();
       if(n<=1) return true;
       if(str.charAt(0) != str.charAt(n-1)) return false;
       String subStr = str.substring(1, n-1);
       return IsPalindrome(subStr);
    }
}
