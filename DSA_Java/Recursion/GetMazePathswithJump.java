import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathswithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = getMazepaths(1,1, n, m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazepaths(int sx, int sy, int dx, int dy){
        if(sx==dx && sy==dy){
            return new ArrayList<String>(){{add(" ");}};
        }

        ArrayList<String> paths = new ArrayList<>();
        // horizontal moves
        for(int ms=1; ms <= dy-sy; ms++){
            ArrayList<String> hpaths = getMazepaths(sx, sy+ms, dx, dy);
            for(String hpath: hpaths){
                paths.add("h" + ms + hpath);
            }
        }
        for(int ms=1; ms<=dx-sx;ms++){
            ArrayList<String> vpaths = getMazepaths(sx + ms, sy, dx, dy);
            for(String vpath:vpaths){
                paths.add("v" + ms + vpath);
            }
        }
        for(int ms=1; ms<=dx-sx && ms<=dy-sy;ms++){
            ArrayList<String> dpaths = getMazepaths(sx + ms, sy + ms, dx, dy);
            for(String dpath:dpaths){
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }
}
