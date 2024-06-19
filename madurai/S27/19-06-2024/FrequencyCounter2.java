class FrequencyCounter2{
    public static void main(String[] args){
        String str = "axaxaxaaahhahdgvsxgjcssss";
        int[] counterArray = new int[26];
        int baseIndex = 97;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int asciiValue = (int) ch;
            counterArray[asciiValue-baseIndex]++;
        }
        System.out.println(counterArray)
    }
}