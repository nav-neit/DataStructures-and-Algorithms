import java.util.Set;
import java.util.HashSet;

public class MissingElementsInRange {
    public static void printmissingelements(int[] arr, int low , int high){
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        for (int i = low; i <= high; i++) {
            if(!st.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 14, 11, 51, 15};
        int low = 50;
        int high = 55;
        printmissingelements(arr,low,high);
    }
}
