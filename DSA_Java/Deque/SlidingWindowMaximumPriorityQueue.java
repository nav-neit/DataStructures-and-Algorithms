import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SlidingWindowMaximumPriorityQueue {
    public static void slidingmax(int[] arr, int k){
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        System.out.print(pq.peek() + " ");
        pq.remove(arr[0]);
        for(int i=k ;i<n;i++){
            pq.add(arr[i]);
            System.out.print(pq.peek() + " ");
            pq.remove(arr[i-k+1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        slidingmax(arr,k);
    }
}
