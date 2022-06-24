import java.util.PriorityQueue;
import java.util.Scanner;

public class ConnectNRopes {
    public static int connectNropes(int [] arr){
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int sum = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            sum = first + second;
            ans += sum;
            pq.add(sum);
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Min Cost Rope " + connectNropes(arr));
    }
}
