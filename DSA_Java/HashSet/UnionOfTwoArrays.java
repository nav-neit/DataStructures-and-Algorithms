import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static Set<Integer> arrayUnion(int[] arr1, int[] arr2){
        Set<Integer> st = new HashSet<>();
        for(int ele:arr1){
            st.add(ele);
        }
        for(int ele:arr2){
            st.add(ele);
        }
        return st;
    }
    public static void main(String[] args) {
        int [] arr1 = {10,20,30,10,40,60,90};
        int [] arr2 = {10,20,50,60,90};
        System.out.println("union" + arrayUnion(arr1, arr2));
     }
}
