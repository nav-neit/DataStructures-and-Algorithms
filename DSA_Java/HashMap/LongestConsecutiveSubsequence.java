import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void ConsecutiveSubsequene(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        int max_len = 0;
        for (int i = 0; i < arr.length; i++) {
            if(!hs.contains(arr[i]-1)){
                int j = arr[i];
                while(hs.contains(j)){
                    j++;
                }
                if(j-arr[i]>max_len){
                    max_len = j - arr[i];
                }
            }
        }
        System.out.println("Length of longest Subsequence : " + max_len);
    }
    public static void main(String[] args) {
        int[] arr = {1 ,9 ,3 ,10 ,4 ,20 ,2};
        ConsecutiveSubsequene(arr);
    }
}
