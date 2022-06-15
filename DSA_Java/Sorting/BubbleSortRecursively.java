import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = bubbleSortRecr(arr, arr.length);
        System.out.println("Sorted Array " + Arrays.toString(ans));
    }
    public static int[] bubbleSortRecr(int[] arr, int arrSize){
        if(arrSize == 1){
            return arr;
        }
        for (int i = 0; i < arrSize-1; i++) {
            if(arr[i]> arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return bubbleSortRecr(arr, arrSize-1);
    }
}
