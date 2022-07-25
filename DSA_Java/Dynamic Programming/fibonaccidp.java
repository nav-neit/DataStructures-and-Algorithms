import java.util.Arrays;
import java.util.Scanner;

public class fibonaccidp {
    // Memoization
    public static int fmemo(int n, int[] dp){
        if(n<=1) return n;

        if(dp[n]!=-1) return dp[n];
        return dp[n] = fmemo(n-1, dp) + fmemo(n-2, dp);
    }
    // Tabulation
    public static int ftab(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <=n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    // Optimized
    public static int fopt(int n){
        int prev2 = 0 , prev = 1;
        for (int i = 2; i <=n; i++) {
            int curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fmemo(n, dp));
        System.out.println(ftab(n));
        System.out.println(fopt(n));
    }
}
