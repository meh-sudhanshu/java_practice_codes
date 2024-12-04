class Palindrome{
    public static void main(String[] args) {
        // String str1 = "sudhanshu kumar";
        // String str2 = "sudhanshu";
        // System.out.println(str1.hashCode());
        // System.out.println(str2.hashCode());
        // System.out.println(str1 == str2);
        // System.out.println(str1.equals(str2));
        String str = "madkjbdevcam";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
    private static boolean isPalindrome(String str){
        int n = str.length();
        if(n <=1) return true;
        if(str.charAt(0) != str.charAt(n-1))
            return false;
        String subStr = str.substring(1, n-1);
        return isPalindrome(subStr);
    }
}