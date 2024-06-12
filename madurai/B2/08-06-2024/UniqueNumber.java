public class UniqueNumber {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {5,1,3,4,7,9,2,8};
        int ans = 0;
        for(int i=1;i<=n;i++) ans = ans^i;
        for(int e: arr) ans = ans^e;
        System.out.println(ans);
    }
}

// https://vjudge.net/group/klupyds10?r=MoVoC0hPaTBf5hYwy87b

//  FEEDBACK FORM: https://forms.gle/7kVNi9KP2RLi52fa6