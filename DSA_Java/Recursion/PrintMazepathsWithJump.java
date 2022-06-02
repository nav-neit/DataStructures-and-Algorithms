import java.util.Scanner;

public class PrintMazepathsWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazepathswithJump(1, 1, n, m, "");
    }
    public static void printMazepathswithJump(int sx, int sy, int dx, int dy, String ans){
        if(sx==dx && sy==dy){
            System.out.print(ans+",");
            return;
        }

        for(int ms =1 ;ms<=dy-sy; ms++){
          printMazepathswithJump(sx, sy+ms, dx, dy, "h" + ms + ans);
        }
        for(int ms =1 ;ms<=dx-sx; ms++){
          printMazepathswithJump(sx+ms, sy, dx, dy, "v" + ms + ans);
        }
        for(int ms =1 ;ms<=dy-sy && ms<=dx-sx; ms++){
          printMazepathswithJump(sx + ms, sy+ms, dx, dy, "d" + ms + ans);
        }
    }
}
