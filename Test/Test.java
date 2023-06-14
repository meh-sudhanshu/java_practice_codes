import java.util.ArrayList;

class Test{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.remove(0);
        int size = arr.size();
        System.out.println(size);
        
       System.out.println(arr);
    }
}