class IsPalindrome{
    public static void main(String[] args) {
        String str = "madam";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
    public static boolean isPalindrome(String str){
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }   
        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }
        return isPalindrome(str.substring(1, str.length()-1));
    }
}

