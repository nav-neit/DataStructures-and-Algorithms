import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        int[] arr = {1,2,2,7,7,3,5,5,4,4,3,3,9,10,10};
        HashSet<Integer> st2 = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st2.add(arr[i]);
        }
        System.out.println(st2);
    }
}
