class IsSquare{
    public static void main(String[] args) {
        int n = 121;
        double sqrt = Math.sqrt((double)n);
        int floor = (int) Math.floor(sqrt);
        if(floor*floor == n){
            System.out.println("perfect square");
        }else{
            System.out.println("not a perfect square");
        }
    }
}