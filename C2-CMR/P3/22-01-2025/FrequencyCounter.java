import java.util.Arrays;

class FrequencyCounter{
    public static void main(String[] args) {
        char[] arr = {'a','b','x','a','a','x','y','d','t','d','d','d','d'};
        int[] counter = new int[26];
        int offSet = 97;
        int maxOccuringIndex = -1;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            char ch = arr[i];
            int index = (int)ch-offSet;
            counter[index] = counter[index]+1;
        }
        System.out.println(Arrays.toString(counter));
        for(int i = 0; i<26; i++){
            if(counter[i] > maxValue && counter[i] != 0){
                maxValue = counter[i];
                maxOccuringIndex = i;
            }
        }
        System.out.println((char)(maxOccuringIndex+97));
    }
}