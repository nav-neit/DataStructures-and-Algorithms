import java.util.Scanner;

public class TargetSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        printtargetsst(arr,0,"",0, tar);
    }
    public static void printtargetsst(int [] arr,int idx, String ans, int sumset, int tar){
        if(idx == arr.length){
            if(sumset == tar){
                System.out.println(ans);
            }
            return;
        }
        printtargetsst(arr,idx+1, ans+ arr[idx] + ",",sumset + arr[idx], tar);
        printtargetsst(arr,idx+1,ans, sumset, tar);
    }
}
