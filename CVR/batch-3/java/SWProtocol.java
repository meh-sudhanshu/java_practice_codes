public class SWProtocol {
    public static void main(String[] args) {
        String str = "abcecsgdtraba";
        int k = 3;
        int i=0,j = k-1;
        int count = 0;
        while(j<str.length()){
            count+= isPalindrome(str.substring(i,j+1));
            i++;
            j++;
        }
        System.out.print(count);


    }

    public static int isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
