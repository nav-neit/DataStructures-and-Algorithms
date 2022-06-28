import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static void getlongestsequence(int[] arr){
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], true);
        }
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i]-1)){
                hm.put(arr[i], false);
            }
        }
        int max_len = -1;
        int start = -1;
        for (int i = 0; i < arr.length; i++) {
            if(hm.get(arr[i])){
                int key = arr[i];
                int len = 0;
                while(hm.containsKey(key)){
                    len++;
                    key++;
                }
                if(len>max_len){
                    start = arr[i];
                    max_len = len;
                }
            }
        }
        while(hm.containsKey(start)){
            System.out.print(start + " ");
            start++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,5,9,1,11,8,6,15,3,12,2};
        getlongestsequence(arr);
    }
}
