
class IsPalindrome{
    public static void main(String[] args) {
        String str = "Madam";
        boolean result = isPalindromeWithRecusrion(str);
        System.out.println(result);

        boolean result2 = isPalindromeWithRecusrion(str);
        System.out.println(result2);
    }

    private static boolean isPalindromeWithRecusrion(String str) {
        int n = str.length();
        if(str.length() == 0 || str.length() ==1) return true;
        if(str.charAt(0 ) != str.charAt(n-1)) return false;
        String subStr = str.substring(1, n-1);
        return isPalindromeWithRecusrion(subStr);
        
    }


    private static boolean isPalindromeWithoutRecusrion(String str){
        int i = 0, j = str.length()-1;
        while (i<j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i+=1;
            j-=1;
        }
        return true;
    }
}

//  str11.equals(str2)