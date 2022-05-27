import java.util.*;

public class dispArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        disparr(a,0);
    }
    public static void disparr(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        disparr(arr,idx+1);

    }
}
