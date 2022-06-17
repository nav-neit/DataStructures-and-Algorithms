import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NGETR {
    public static int[] nextGreaterToRight(int [] arr){
        int [] ngetr = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        ngetr[arr.length-1] = -1;
        s.push(arr[arr.length-1]);
        for (int i = arr.length-2; i >= 0; i--) {
            int ele = arr[i];
            while(!s.isEmpty() && s.peek()<=ele){
                s.pop();
            }
            if(s.isEmpty()){
                ngetr[i] = -1;
            }else{
                ngetr[i] = s.peek();
            }
            s.push(ele);
        }
        return ngetr;
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
