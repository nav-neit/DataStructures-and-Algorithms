import java.util.*;

public class power_linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
    }
    public static int power(int x,int n)
    {
        if(n==0)
            return 1;
        int pow = x * power(x,n-1);
        return pow;
    }
}
