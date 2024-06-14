class Toh{
    public static void main(String[] args){
        int n = 3;
        char src = 'A', des='C', aux='B';
        tower_of_hanoi(src,des,aux,n);
    }
    public static void tower_of_hanoi(char src, char des, char aux, int n){
        if(n<=0) return;
        tower_of_hanoi(src,aux,des,n-1);
        System.out.println(src+"->"+des);
        tower_of_hanoi(aux,des,src,n-1);
    }
}