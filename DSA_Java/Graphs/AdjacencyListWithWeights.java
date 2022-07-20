import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyListWithWeights {
   static class NodePair{
       int val;
       int wt;
       NodePair(int val, int wt){
           this.val = val;
           this.wt = wt;
       }
   }
    public static void takeinput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<NodePair>> adj  =new ArrayList<ArrayList<NodePair>>();

        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<NodePair>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int wt = sc.nextInt();

            adj.get(u).add(new NodePair(v, wt));
            adj.get(v).add(new NodePair(u, wt));
        }

   }
    public static void main(String[] args) {
        takeinput();
    }
}
