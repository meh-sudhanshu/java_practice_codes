import java.lang.Math;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // for(int i=0;true;i++){
        //     int myRandomNumber = 6;
        //     if(myRandomNumber == 6){
        //         System.out.println(myRandomNumber);
        //         break;
        //     }
        //     System.out.println(myRandomNumber);
        // }
        for(int i=0;i<=10;i++){
            // if(i == 5){
            //     continue;
            // }else if(i == 9){
            //     break;
            // }
            // System.out.println(i);

            // if(i == 0){
            //     System.out.println(i);
            // }else if(i == 1){
            //     System.out.println(i+1);
            // }else if(i == 2){
            //     System.out.println(i+1);
            // }else{
            //     System.out.println("Else getting executed");
            // }
            // if(i == 1){
            //     continue;
            // }

            // else if{
            //     System.out.println();
            // }
        }
    
        // while(true){
        //     int min = 1;
        //     int max = 10;
        //     double myRandomNumber = Math.random();
        //     int truncatedIntegerValue = ((int)(myRandomNumber*(max-min+1)+min));
        //     if(truncatedIntegerValue == 6){
        //         System.out.println(truncatedIntegerValue);
        //         break;
        //     }
        //     System.out.println(truncatedIntegerValue);
        // }
        
        // int i = 10;
        // while (i < 10) {
        //     System.out.println(i);
        // }

        // int i = 10;
        // do{
        //     System.out.println(i);
        // }while(i < 10);

        // int[] arr = new int[10];
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(i);
        // }

        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(10);arr.add(20);arr.add(30);arr.add(34);arr.add(34);
        // arr.add(10);arr.add(20);arr.add(30);arr.add(34);arr.add(34);
        // arr.add(10);arr.add(20);arr.add(30);arr.add(34);arr.add(34);
        // arr.add(10);arr.add(20);arr.add(30);arr.add(34);arr.add(34);

        // for(int i=0;i<arr.size();i++){
        //     arr.remove(10);
        //     System.out.println(arr.get(i));
        // }
        // int[] arr = {1,2,3,4,5,6,5};
        // // for(int i=0;i<arr.length;i++){
        // //     System.out.println(arr[i]);
        // // }
        // int i;
        // for(int e : arr){
        //     System.out.println(e);
        // }
        int[][] arr = {{1,2,3,4},{4,5,6,7},{8,9,10,11}};
        for(int[] a : arr){
            for(int e : a){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}

// break will break the execution of a loop