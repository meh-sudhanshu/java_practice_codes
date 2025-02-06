public class BackDate {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        String str1 = "Thank You Sir";
        String str2 = "Thank You Sir";
        
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode() == str2.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
