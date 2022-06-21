import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {
    public static int largestAreaRect(int[] arr){
        int[] ngetr = new int[arr.length]; // right boundary
        Stack<Integer> st1 = new Stack<>();
        st1.push(arr.length-1);
        ngetr[arr.length-1] = arr.length;
        for(int i = arr.length-2; i>=0; i--){
            while(!st1.isEmpty() && arr[st1.peek()]>arr[i]){
                st1.pop();
            }
            if(st1.isEmpty()){
                ngetr[i] = arr.length;
            }else{
                ngetr[i] = st1.peek();
            }
            st1.push(i);
        }

        int[] ngetl = new int[arr.length]; //left boundary
        ngetl[0] = -1;
        Stack<Integer> st2 = new Stack<>();
        st2.push(0);
        for(int i = 1; i<arr.length; i++){
            while(!st2.isEmpty() && arr[st2.peek()]>arr[i]){
                st2.pop();
            }
            if(st2.isEmpty()){
                ngetl[i] = -1;
            }else{
                ngetl[i] = st2.peek();
            }
            st2.push(i);
        }


        int maxarea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = ngetr[i] - ngetl[i] -1;
            int area = arr[i] * width;
            maxarea = Math.max(maxarea, area);
        }

        return maxarea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int area = largestAreaRect(arr);
        System.out.println("Maximum Histogram Area : " +area);
    }
}
