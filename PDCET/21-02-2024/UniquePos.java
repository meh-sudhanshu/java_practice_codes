import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class UniquePos {
    public static void main(String[] args) {
        String str = "FFBFBFBFFBFFBBBFFFBF";
        int ans = getUniquePositionCount(str);
        System.out.println(ans);
    }

    private static int getUniquePositionCount(String str) {
        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(0);
        int fc = 2, bc = 2;
        int cpos = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'F'){
                cpos += fc;
                if(fc == 2) fc=1;
                else fc = 2;
            }else{
                if(cpos - bc >=0){
                    cpos = cpos-bc;
                    if(bc == 2) bc=1;
                    else bc = 2;
                }
            }
            mySet.add(cpos);
        }
        Iterator<Integer> i = mySet.iterator();

        while (i.hasNext()) {
            System.out.print(i.next()+" ");
        }
        System.out.println();
        return mySet.size();
    }
}
