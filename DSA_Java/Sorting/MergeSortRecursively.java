import java.util.Scanner;

public class MergeSortRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] ans = mergeSort(a, 0, a.length-1);
        disparr(ans);
    }
    public static void disparr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] mergeSort(int [] arr, int low, int high){
        if(low==high){
           int[] ba = new int[1];
           ba[0] = arr[low];
           return ba;
        }
        int mid = (low+ high) / 2;
        int[] fsh = mergeSort(arr,low, mid);
        int[] ssh = mergeSort(arr,mid+1, high);
        int[] fsa = mergetwosortedarrays(fsh, ssh);
        return fsa;
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
