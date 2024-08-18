class Palindrome{
    public static void main(String[] sudhanshu) {
        // int[] arr = {1,2,3};
        // System.out.println(arr.length);
        String str = "malayalamhvj";
        boolean ans =  isPalindrome(str);
        System.out.println(ans);
    }
    public static boolean isPalindrome(String str){
        int i = 0, j = str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
}