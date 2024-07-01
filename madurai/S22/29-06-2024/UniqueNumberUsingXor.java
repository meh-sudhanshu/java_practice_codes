public class UniqueNumberUsingXor {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 3, 4, 4, 2, 7, 9, 3 };
        int ans = getUniqueNumberUsingXor(arr);
        System.out.println(ans);
    }

    private static int getUniqueNumberUsingXor(int[] arr) {
        int ans = 0;
        for(int e : arr) ans = ans ^ e;
        return ans;
    }
}
