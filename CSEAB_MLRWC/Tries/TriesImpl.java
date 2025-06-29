import java.util.HashMap;

class Tries{
    boolean isEndOfWord;
    HashMap<Character,Tries> childrens;

    Tries(){
        this.isEndOfWord = false;
        this.childrens = new HashMap<>();
    }
    public void insert(Tries root , String word){
        Tries temp = root;
        for(int i = 0; i< word.length(); i++){
            char ch = word.charAt(i);
            if(temp.childrens.containsKey(ch) == false){
                temp.childrens.put(ch, new Tries());
            }
            temp = temp.childrens.get(ch);
        }
        temp.isEndOfWord = true;
    }
    public boolean search(Tries root, String word){
        Tries temp = root;
        int n = word.length();
        for(int i = 0; i < n; i++){
            char ch = word.charAt(i);
            if(temp.childrens.containsKey(ch) == false) return false;
            temp = temp.childrens.get(ch);
        }
        return temp.isEndOfWord;
    }

    public boolean startsWith(Tries root, String prefix){
        return true;
    }
     public int dfsCount(Tries root){
            int count = root.isEndOfWord == true ? 1 : 0;
            for(char key : root.childrens.keySet()){
                count+=dfsCount(root.childrens.get(key));
            }
        return count;
    }
    public int getPrefixCount(Tries root, String prefix){
        Tries temp = root;
        for(int i = 0; i< prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(temp.childrens.containsKey(ch) == false) return 0;
            temp = temp.childrens.get(ch);
        }
        return dfsCount(temp);
    }


}

public class TriesImpl {
    public static void main(String[] args) {
        Tries root = new Tries();
        String[] words = {"madam","maxm","apple","max","maxi"};

        for(String word : words){
            root.insert(root, word);
        }
        // root.insert(root, "madam");
        // root.insert(root, "max");
        //System.out.println(root.search(root,"madam"));
        //String word = words[0];
        // for(int i = 0; i< words.length; i++){
        //     String  word = words[0];
        //     for(int j = 0; j< word.length(); j++){
        //       if(root != null){
        //           char ch = word.charAt(j);
        //         System.out.println(root.childrens);
        //         root = root.childrens.get(ch);
        //       }
        //     }
            
        // }
        System.out.println(root.search(root,"apple"));
        System.out.println(root.search(root,"maximum"));
        System.out.println(root.search(root,"maxu"));
        System.out.println(root.search(root,"maxi"));
        System.out.println(root.search(root,"mad"));
        System.out.println(root.getPrefixCount(root, "mam"));
        System.out.println(root.getPrefixCount(root, "max"));
    }
}
