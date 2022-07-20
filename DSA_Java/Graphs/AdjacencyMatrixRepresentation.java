import java.util.Scanner;
public class AdjacencyMatrixRepresentation {
    public static void takeinput(){
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] adj = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int u,v;
            u = sc.nextInt();
            v = sc.nextInt();
            adj[u][v] = 1;
            adj[v][u] = 1;
        }
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[0].length; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        takeinput();
    }
}
