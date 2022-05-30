import java.lang.reflect.Array;
import java.util.*;
public class GetMazepaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int dx = sc.nextInt();
        int dy = sc.nextInt();
        ArrayList<String> paths = getMazePaths(sx, sy, dx, dy);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sx , int sy, int dx, int dy){

        if(sx==dx && sy==dy){
            return new ArrayList<String>(){{add(" ");}};

        }
        ArrayList<String> paths1 = new ArrayList<>();
        ArrayList<String> paths2 = new ArrayList<>();
        if(sy<dy){
            paths1 = getMazePaths(sx , sy + 1 , dx, dy );
        }
        if(sx<dx){
            paths2 = getMazePaths(sx+1 , sy  , dx, dy );
        }

        ArrayList<String> path = new ArrayList<>();
        for(String paths:paths1){
            path.add("h"+paths);
        }
        for(String paths:paths2){
            path.add("v"+paths);
        }
        return path;
    }
}
