import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        int li = lastindex(a,0,data);
        System.out.println(li);
    }
    public static int lastindex(int[] arr,int idx, int key ){
        if(arr.length==idx){
            return -1;
        }

        int lidx = lastindex(arr, idx+1, key);
        if(lidx==-1){
            if(arr[idx]==key) {
                return idx;
            }
            return -1;
        }
        else{
            return lidx;
        }

    }

}
