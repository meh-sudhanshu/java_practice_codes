public class SwitchCaseExample {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
           case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Any other day");
        }
    }
}
