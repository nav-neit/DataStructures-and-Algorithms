import java.util.Scanner;

public class maxOFarrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = maxarr(a,0);
        System.out.println(m);
    }
    public static int maxarr(int[] arr, int idx){
        if(arr.length-1 == idx){
            return arr[idx];
        }

        int mx = maxarr(arr,idx+1);
        if(arr[idx]>mx){
            return arr[idx];
        }
        return mx;
    }
}
