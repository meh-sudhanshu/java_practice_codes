

public class StringSorting {
    public static void main(String[] args) {
        String[] arr = {"my","name","is","sudhanshu","kumar"};
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(i != j){
                    if(arr[i].length() < arr[j].length()){
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}
