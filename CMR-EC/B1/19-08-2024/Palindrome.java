

public class Palindrome {
    public static void main(String[] args) {
        String str = "mad1am";

        boolean ans = isPalindrome(str);
        System.out.println(ans);

    }

    private static boolean isPalindrome(String str) {
       int n = str.length();
       if (n<=1) {
            return true;
       }
       if (str.charAt(0) != str.charAt(n-1)) {
            return false;
       }

       String subStr = str.substring(1, n-1);

       return isPalindrome(subStr); 
    }
}
