class IsPalindrome{
    public static void main(String[] args){
        String str = "malayalam";
        int i = 0, j = str.length()-1;
        boolean ans = true;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                ans = false;
                break;
            }
            i+=1;
            j-=1;
        }

        System.out.print(ans);
        
    }
}