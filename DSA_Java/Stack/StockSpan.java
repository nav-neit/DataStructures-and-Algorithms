import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static int[] stockspan(int[] arr){
        int[] ngt = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        ngt[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ngt[i] = i + 1;
            }else{
                if(arr[st.peek()]>arr[i]){
                    ngt[i] = i - st.peek();
                }
            }
            st.push(i);
        }
        return ngt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] span  = stockspan(arr);
        System.out.println("Span Array : " + Arrays.toString(span));
    }
}
