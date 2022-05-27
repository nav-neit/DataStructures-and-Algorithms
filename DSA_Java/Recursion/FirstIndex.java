import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int idx = firstindex(a,0, data);
        System.out.println(idx);
    }
    public static int firstindex(int[] arr, int idx, int key){

        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        else{
            int fidx = firstindex(arr,idx+1,key);
            return fidx;
        }
    }
}
