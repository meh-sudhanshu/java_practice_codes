

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "MadaMuyy";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        if(str.length() == 0 || str.length() == 1) return true;
        if(str.charAt(0) != str.charAt(str.length()-1)) return false;
        String subStr = str.substring(1, str.length()-1);
        return isPalindrome(subStr);
    }
}
