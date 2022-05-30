import java.sql.Array;
import java.util.*;

public class Getstairpaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getStairsPaths(n);
        System.out.println(paths);
    }
    public static ArrayList<String> getStairsPaths(int n){

        if(n==0){
            return new ArrayList<String>(){{add(" ");}};
        }
        else if (n<0){
            return new ArrayList<String>();
        }

        ArrayList<String> paths1 = getStairsPaths(n-1);
        ArrayList<String> paths2 = getStairsPaths(n-2);
        ArrayList<String> paths3 = getStairsPaths(n-3);

        ArrayList<String> mres = new ArrayList<>();
        for (String path : paths1) {
            mres.add('1' + path);
        }
        for (String path : paths2) {
            mres.add('2' + path);
        }
        for (String path : paths3) {
            mres.add('3' + path);
        }
        return mres;
    }
}
