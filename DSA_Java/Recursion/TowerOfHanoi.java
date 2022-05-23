import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TOH(n, 'A', 'B', 'C');
    }
    public static void TOH(int n, char A, char B, char C) {
        if(n==0){
            return;
        }
        TOH(n-1, A, C, B);
        System.out.println("Move disc from " + A + " to " + B);
        TOH(n-1, C, B ,A);
    }
}
