class Addition{
    Addition(){}
    Addition(int a, int b){
        System.out.println(a+b);
    }
    Addition(int a , int b , int c){
        System.out.println(a+b+c);
    }
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public int add(int... arr){
        int ans = 0;
        for(int i = 0; i< arr.length; i++){
            //ans+=arr[i];
            ans = ans + arr[i];
        }
        return ans;
    }
}
class Mathematics{
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        Addition myObj = new Addition(10,20,30);
        System.out.println(myObj.add(10));
        System.out.println(myObj.add(10,20));
        System.out.println(myObj.add(10,20,30));
    }
}

/*
 int -> Integer
 byte -> Byte
 short -> Short
 long -> Long

 char -> Character
 bool -> Boolean
 float -> Float
 double -> Double
 */