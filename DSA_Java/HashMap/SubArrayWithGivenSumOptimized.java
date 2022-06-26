import java.util.HashMap;

public class SubArrayWithGivenSumOptimized {
    public static void findSubArrays(int[] arr, int sum){
        int currsum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int start = 0, end = -1;
        // only gets one single sub array since keys get overridden
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if(currsum-sum == 0){
                start = 0;
                end = i;
                break;
            }
            if(hm.containsKey(currsum-sum)){
                start = hm.get(currsum-sum) + 1;
                end = i;
                break;
            }
            hm.put(currsum, i);
        }
        if(end!=-1){
            for (int i = start; i <=end; i++) {
                System.out.print(arr[i] +  " ");
            }
        } else {
            System.out.println("There is no subarray with given sum");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 15, -5, 15, -10, 20};
        int sum = 5;
        findSubArrays(arr, sum);
    }
}
