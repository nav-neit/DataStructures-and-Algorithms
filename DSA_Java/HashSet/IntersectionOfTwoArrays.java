import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static Set<Integer> arrIntersection(int[] arr1, int[] arr2){
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        for(int ele: arr1){
            st1.add(ele);
        }
        for(int ele : arr2){
            if(st1.contains(ele)){
                st2.add(ele);
            }
        }
        return st2;
    }
    public static void main(String[] args) {
        int [] arr1 = {10,20,30,10,40,60,90};
        int [] arr2 = {10,20,50,60,90};
        System.out.println("Intersection " + arrIntersection(arr1, arr2));
    }
}
