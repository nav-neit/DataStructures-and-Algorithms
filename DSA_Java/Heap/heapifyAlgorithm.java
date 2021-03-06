import java.util.Arrays;

public class heapifyAlgorithm {
    public static  void heapify(int[] a, int n, int i){
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;
        if(l < n && a[l] > a[largest]){
            largest = l;
        }
        if(r < n && a[r] > a[largest]){
            largest = r;
        }
        if(largest != i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a, n ,largest);
        }
    }
    public static void buildheap(int[] a, int n){
        for (int i = n/2; i >=0 ; i--) {
            heapify(a,n,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,25, 15, 80, 55, 90};
        buildheap(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
