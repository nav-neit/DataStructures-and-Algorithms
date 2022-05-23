import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }
    public static void pzz(int n){
        if(n==0){
            return;
        }

        System.out.println("Pre " + n);
        pzz(n-1);
        System.out.println("In" + n);
        pzz(n-1);
        System.out.println("Post " + n);
    }
}
