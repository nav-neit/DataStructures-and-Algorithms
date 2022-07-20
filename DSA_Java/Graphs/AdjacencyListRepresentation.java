import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyListRepresentation {
    public static void takeinput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i<=n ; i++)
            list.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }
        System.out.println(list);
     }
    public static void main(String[] args) {
        takeinput();
    }
}
