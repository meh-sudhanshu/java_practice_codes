package ArrayListImpl;

import java.util.ArrayList;

public class ArrayListImpl {
    public static void main(String[] args) {
        int[] arrToBeAdded = {-100,-200,-300,-400};


        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(0,40);
        arrayList.add(2,100);

        int valueAtIndex2 = arrayList.get(2);
        System.out.println(valueAtIndex2+" is present at index 2");

        printList(arrayList);

        int removedValue = arrayList.remove(1);
        System.out.println(removedValue+" has been removed from your arraylist");

        for(int e : arrToBeAdded){
            arrayList.add(e);
        }

//        System.out.println(arrayList.isEmpty());
//        arrayList.clear();
//        System.out.println(arrayList.isEmpty());



        printList(arrayList);
    }
    public static void printList(ArrayList<Integer> arr){
        for(int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
