import java.util.*;
class FrequencyCounterUsingArray{
    public static void main(String[] args){
        String str = "axaddfscxgcsafxsdfacxsasxzax";
        int[] counterArray = new int[26];
        int baseIndex = 97;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int asciiValue = (int)ch;
            counterArray[asciiValue-baseIndex]+=1;
        }

        System.out.println(Arrays.toString(counterArray));
    }
}
// https://github.com/meh-sudhanshu/java_practice_codes/tree/master/madurai/S22