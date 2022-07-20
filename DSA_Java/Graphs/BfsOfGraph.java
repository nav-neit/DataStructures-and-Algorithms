import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
public class BfsOfGraph {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj, int[] visited) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> Q = new ArrayDeque<>();
        Q.add(V);
        visited[V] = 1;
        while(!Q.isEmpty()){
            int node = Q.peek();
            ans.add(node);
            for(int i= 0; i<adj.get(node).size();i++){
                int adjacent_node = adj.get(node).get(i);
                if(visited[adjacent_node] == 0){
                    Q.add(adjacent_node);
                    visited[adjacent_node] = 1;
                }
            }
            Q.remove();
        }
        return ans;
    }
    public static void bfs(int V, ArrayList<ArrayList<Integer>> adj){
        int[] visited = new int[V];
        for (int i = 0; i < V; i++) {
            if(visited[i] != 0){
                ArrayList<Integer> ans = bfsOfGraph(i, adj, visited);
            }
        }
    }
}
