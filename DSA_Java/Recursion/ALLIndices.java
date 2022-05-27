import java.util.Scanner;

public class ALLIndices {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int[] ans = allindx(a,data,0,0);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] allindx(int[] arr, int x, int idx, int fsf){
        if(arr.length==idx){
            return new int[fsf];
        }
        if(arr[idx]==x){
            int[] iarr = allindx(arr, x, idx+1, fsf+1);
            iarr[fsf] = idx;
            return iarr;
        }
        else {
            return allindx(arr, x, idx + 1, fsf);
        }
    }
}
