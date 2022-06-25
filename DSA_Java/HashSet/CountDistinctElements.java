import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountDistinctElements {
    public static int countdistinct(int [] arr){
        Set<Integer> st = new HashSet<>();
        for (int ele:arr){
            st.add(ele);
        }
        return st.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Count of Distinct Elements " + countdistinct(arr));
    }
}
