import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        int[] arr = {1,2,2,7,7,3,5,5,4,4,3,3,9,10,10};
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        System.out.println(st);

    }
}
