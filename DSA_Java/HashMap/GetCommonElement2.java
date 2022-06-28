import java.util.HashMap;

public class GetCommonElement2 {
    public static void getcommon(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            hm.put(arr1[i], hm.getOrDefault(arr1[i],0) + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(hm.containsKey(arr2[i])){
                System.out.print(arr2[i] + " ");
                if(hm.get(arr2[i])==1){
                    hm.remove(arr2[i]);
                }else{
                    hm.put(arr2[i], hm.get(arr2[i]) -1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,1,2,2,2,3,5};
        int arr2[] = {1,1,1,2,2,4,5};
        getcommon(arr1, arr2);
    }
}
