import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NGETRAlternate {
    public static int[] nextGreaterToRight(int[] arr){
        int[] ngt = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int pos = st.peek();
                ngt[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ngt[st.peek()] = -1;
            st.pop();
        }
        return ngt;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = nextGreaterToRight(arr);
        System.out.println("NGETR Array " + Arrays.toString(ans));
    }
}
