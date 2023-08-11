public class IsValid {
    public static void main(String[] args) {
        String str = "[[[[]]]]";
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '[') count++;
            else count--;
        }
        System.out.println(count==0); 
    }
}
