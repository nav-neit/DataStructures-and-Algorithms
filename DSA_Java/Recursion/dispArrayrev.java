import java.util.*;

public class dispArrayrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        disparrrev(a,0);
    }
    public static void disparrrev(int [] arr,int idx){
        if(arr.length == idx){
            return;
        }
        disparrrev(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
