import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindowMaximumDeque {
    public static int[] slidingmax(int[] arr, int k){
        int n = arr.length;
        int[] ans = new int[n-k+1];
        int ri = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            // remove all out of bound index from front of deque
            if(!dq.isEmpty() && dq.peekFirst() == i-k){
                dq.pollFirst();
            }
            // remove indices of all numbers from end of dq which are less than current element
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.pollLast();
            }
            // push the i th index into last of deque
            dq.offerLast(i);
            if(i >= k - 1){
                ans[ri] = arr[dq.peekFirst()];
                ri++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = slidingmax(arr,k);
        System.out.println("Answer : " + Arrays.toString(ans));
    }
}
