import java.util.Arrays;

public class SubArrayWithGivenSumNaive {
    public static void findSubArraysNaive(int[] arr ,int s){
        boolean flag = false;
        int n = arr.length;
        // Pick starting point
        for (int i = 0; i < n; i++) {
            // pick ending point
            for (int j = i; j < n; j++) {
                //Print all elements btw these points
                int[] ans = new int[j-i +1];
                int sum = 0;
                for (int k = i; k <=j; k++) {
                    sum += arr[k];
                    ans[k-i] = arr[k];
                }
                if(sum == s){
                    flag = true;
                    System.out.println(Arrays.toString(ans));
                }
            }
        }
        if(!flag){
            System.out.println("No SubArray with given sum");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 15, -5, 15, -10, 20};
        int sum = 10;
        findSubArraysNaive(arr, sum);
    }
}
