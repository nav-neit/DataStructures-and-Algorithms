import java.util.Arrays;
import java.util.HashMap;

public class ArrayPairSumDivisibility {
    public static boolean ispairsumdivisiblenaive(int arr[], int k){
        if(arr.length%2!=0){
            return false;
        }
        boolean[] visited = new boolean[arr.length];
        for(int i = 0;i<arr.length;i++){
            int rem = k - arr[i]%k;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]%k==rem){
                    visited[j] = true;
                    visited[i] = true;
                }
            }
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false){
                return false;
            }
        }
        return true;
    }
    public static boolean ispairsumdivisibleoptimized(int arr[], int k){
        if(arr.length%2!=0){
            return false;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int rem = (arr[i]%k + k)%k;
            hm.put(rem, hm.getOrDefault(rem,0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            int rem = (arr[i] %k + k)%k;
            if(2*rem==k) {
                if(hm.get(rem)%2==1){
                    return false;
                }
            }else if(rem==0){
                if(hm.get(rem)%2==1){
                    return false;
                }
            }else{
                if(hm.get(k-rem) != hm.get(rem)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {92, 75, 65, 48, 45, 35};
        int k =10;
        System.out.println(ispairsumdivisiblenaive(arr,k));
        System.out.println(ispairsumdivisibleoptimized(arr,k));
    }
}
