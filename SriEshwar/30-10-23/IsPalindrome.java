public class IsPalindrome {
    public static void main(String[] args) {
        String s = "MadaMcdc";
        System.out.println(isPalindrome(s));
    }
    private static boolean isPalindrome(String s) {
        if(s.length() == 1 || s.length() == 0) return true;
        if(s.charAt(0) != s.charAt(s.length()-1)) return false;
        String subStr = s.substring(1, s.length()-1);
        return isPalindrome(subStr);
    }
}
