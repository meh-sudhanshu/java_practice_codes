package wednesday;

public class RotatedString {
    public static void main(String[] args) {
        String str = "axaxabcdcvdscuydbc";
        int index = 6;
        str = rotateString(str,index);
        System.out.println(str);
    }

    private static String rotateString(String str,int index) {
        String subStr = str.substring(0,index);
        for(int i=index;i<str.length();i++){
            subStr = str.charAt(i)+subStr;
        }
        return subStr;
    }
}
