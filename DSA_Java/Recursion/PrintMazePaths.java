import java.util.Scanner;

public class PrintMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMAzepaths(1, 1, n, m, "");
    }
    public static void printMAzepaths(int sx, int sy, int dx, int dy, String ans){
        if(sx==dx && sy==dy){
            System.out.print(ans + ",");
            return;
        }
        if(sy<dy){
        printMAzepaths(sx, sy +1, dx, dy, "h" + ans);
        }
        if(sx<dx){
        printMAzepaths(sx+1, sy, dx, dy, "v" + ans);
        }
    }
}
