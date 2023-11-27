package COMMON;

public class MinimumCost {
    public static void main(String[] args) {
        String str = "kumar";
        int minimumCost = getMinimumCost(str);
        System.out.println(minimumCost);
    }

    private static int getMinimumCost(String str) {
        int cost = 0;
        int[][] charCost = new int[5][5];
        for(int i=0;i<str.length();i++){
            boolean isVowel = isCharacterVowel(str.charAt(i));
            if (!isVowel) {
                cost += 10;
            }else{
                for(int k =0;k<5;k++){
                    int flag = 'a';
                    if(k==0) flag='a'; else if(k==1) flag='e'; else if(k==2) flag='i'; else if(k==3) flag='o'; else if(k==4) flag='u';
                    int currentCost = (int) str.charAt(k) - (int)flag;
                    charCost[i][k] = currentCost;
                }
            }
        }
        int minimumColumCost = getMinimumColumnCost(charCost);
        return cost+minimumColumCost;
    }

    private static int getMinimumColumnCost(int[][] charCost) {
        return 0;
    }

    private static boolean isCharacterVowel(char chr) {
        if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') return true;
        return false;
    }
}
