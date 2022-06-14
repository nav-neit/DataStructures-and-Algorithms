import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[n];
        int [] b= new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }
        disparr(a);
        disparr(b);
        int[] ans  = mergetwosortedarrays(a,b);
        disparr(ans);
    }
    public static void disparr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] mergetwosortedarrays(int [] a, int []b){
        int len = a.length + b.length;
        int[] res = new int[len];
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                res[k] = a[i];
                i++;
            }else{
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            res[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
}
