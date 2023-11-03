package COMMON;

import java.util.HashMap;

public class Vote {
    public static void main(String[] args) {
        int[] vote = {1,2,3,1,2,4};
        int[] age = {16,18,25,27,22,35};

        int winner = findWinner(vote,age);
        System.out.println(winner);
    }

    private static int findWinner(int[] vote, int[] age) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        int winner = -1;
        int maximumVote = -1;
        boolean isAnsMinusOne = true;
        for(int i=0;i<vote.length;i++){
            int candidate = vote[i];
            boolean isValid = age[i]>=18 ? true : false;
            if(isValid){
                  if(myMap.containsKey(candidate)){
                    int counter = myMap.get(candidate);
                    counter++;
                    myMap.put(candidate, counter);
                }else{
                    myMap.put(candidate, 1);
                }
            }
        }
        for(int key : myMap.keySet()){
            int value = myMap.get(key);
            if(value > maximumVote){
                winner = key;
                maximumVote = value;
                isAnsMinusOne = false;
            }
        }
        if(isAnsMinusOne) return -1;
        return winner;
    }
}
