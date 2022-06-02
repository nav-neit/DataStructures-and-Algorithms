import java.util.Scanner;

public class PrintStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPaths(n,"");
    }
    public static void printStairPaths(int n, String path){
        if(n==0){
            System.out.print(path + ",");
            return;
        }
        else if(n<0){
            return;
        }
        printStairPaths(n-1, "1" + path);
        printStairPaths(n-2, "2" + path);
        printStairPaths(n-3, "3" + path);
    }
}
