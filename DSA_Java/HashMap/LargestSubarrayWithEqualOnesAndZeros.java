import java.util.HashMap;

public class LargestSubarrayWithEqualOnesAndZeros {
    public static void findlargestSubArray(int[] arr){
        int currsum = 0;
        int max_len = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i<arr.length;i++){
            currsum += (arr[i]==1)?1:-1;
            if(mp.containsKey(currsum)){
                if(i-mp.get(currsum)>max_len){
                    max_len = i-mp.get(currsum);
                    end = i;
                }
            }else{
                mp.put(currsum,i);
            }
        }
        start = end  - max_len+1;
        if(end == -1){
            System.out.println("There is no subarray with given sum");
        }else{
            for (int i = start; i <=end ; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,0,0};
        findlargestSubArray(arr);
    }
}
