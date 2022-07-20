import java.util.ArrayList;
public class DfsOfGraph {
    public static void dfs(int v,int idx, ArrayList<Integer> ans, int[] visited, ArrayList<ArrayList<Integer>> adj){
        ans.add(v);
        visited[v] = 1;
        for(int ele : adj.get(v)){
            if(visited[ele]==0)
                dfs(ele, idx, ans, visited, adj);
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        int visited[] = new int[V];
        dfs(0,0,ans, visited, adj);
        return ans;
    }
}
