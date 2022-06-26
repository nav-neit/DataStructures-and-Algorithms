import java.util.HashMap;

public class CountDistinctElementsInWindowK {
    public static void countdisinctnaive(int[] arr, int k){
        int n = arr.length;
        for (int i = 0; i <= n-k; i++) {
            int count_distinct = 0;
            for(int j = i;j < i + k;j++){
                boolean found = false;
                for(int r=j; r<i+k;r++){
                    if(arr[j]==arr[r] && j!=r){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    count_distinct++;
                }
            }
            System.out.println(count_distinct);
        }
    }
    public static void countdisinctoptim(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map.size());
        for (int i = k; i < n; i++) {
            if(map.get(arr[i-k])==1){
                map.remove(arr[i-k]);
            }else{
                map.put(arr[i-k], map.get(arr[i-k])-1);
            }
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
            System.out.println(map.size());
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,1,1,3};
        int k = 4;
        countdisinctnaive(arr,k);
        System.out.println("Optimiszed Solution");
        countdisinctoptim(arr,k);
    }
}
