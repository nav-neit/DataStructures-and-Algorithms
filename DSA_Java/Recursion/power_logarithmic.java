import java.util.*;

public class power_logarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = pow(x,n);
        System.out.println(ans);
    }
    public static int pow(int x, int n)
    {
        if(n==0)
            return 1;
//        int xn;
//        if(n%2==0){
//            xn = pow(x, n / 2) * pow(x , n/2);
//        }
//        else{
//            xn = pow(x , n/2) * pow(x, n / 2) *x;
//        }
//        return xn;
        int xnb2 = pow(x , n / 2);
        int xn = xnb2 * xnb2;
        if(n%2==1)
            xn = xn *x;
        return xn;
    }
}
