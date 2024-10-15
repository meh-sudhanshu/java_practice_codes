import java.util.Arrays;

class CountFrequncy{
    public static void main(String[] args) {
        String str = "sudhanshukumarsingh";
        int[] arr = new int[26];
        int offSet = 97;
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            int ascci = (int)ch;
            int index = ascci - offSet;
            arr[index] +=1;
        }
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<26;i++){
            if(arr[i] != 0){
                int frequency = arr[i];
                int index = i;
                int ascii = index+offSet;
                char ch = (char)ascii;
                System.out.println(ch+"->"+frequency);
            }
        }
    }
}