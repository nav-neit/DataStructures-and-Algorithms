import java.util.*;

public class decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = sc.nextInt();
        printDecreasing(n);
    }
    public static void printDecreasing(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
