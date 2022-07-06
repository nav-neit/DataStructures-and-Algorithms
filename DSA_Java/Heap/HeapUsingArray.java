import java.util.ArrayList;
import java.util.Arrays;

public class HeapUsingArray {
    public static void delete(int[] arr, int n){
        int val = arr[1];
        System.out.println(val);
        arr[1] = arr[n];
        n = n-1;
        int i = 1;
        while(i<n){
            int left = arr[2*i];
            int right = arr[2*i+1];
            int large = left>right?2*i:2*i+1;
            if(arr[i]<arr[large]){
                int temp = arr[i];
                arr[i] = arr[large];
                arr[large] = temp;
                i = large;
            }else{
                return;
            }
        }
    }
    public static void insert(int[]arr,int n, int val){
        n = n + 1;
        arr[n] =  val;
        int i = n;
        while(i>1){
            int parent = i / 2;
            if(arr[parent] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
                i = parent;
            }else{
                return;
            }
        }

    }
    public static void disp(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int max = 1000;
        int[] arr = new int[max];
        insert(arr, 0, 10);
        insert(arr, 1, 25);
        insert(arr, 2, 15);
        insert(arr, 3, 55);
        insert(arr, 4, 85);
        insert(arr, 5, 35);
        disp(arr);
        delete(arr, 5);
        delete(arr, 4);
        delete(arr, 3);

        delete(arr, 2);
        delete(arr, 1);
        disp(arr);
    }
}
