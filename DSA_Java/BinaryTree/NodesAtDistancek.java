import java.util.*;

public class NodesAtDistancek {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void MarkParents(Node node, Map<Node , Node> parent_track){
        // Mark parents of all the nodes
        Queue<Node> Q  = new ArrayDeque<>();
        Q.add(node);
        while(!Q.isEmpty()){
            Node current = Q.remove();
            if(current.left!=null){
                parent_track.put(current.left, node);
                Q.add(current.left);
            }
            if(current.right!=null){
                parent_track.put(current.right, node);
                Q.add(current.right);
            }
        }
    }
    public static List<Integer> distanceK(Node node, Node target, int k){
        List<Integer> ans = new ArrayList<>();
        Map<Node, Node> parent_track = new HashMap<>();
        MarkParents(node,parent_track);
        Map<Node , Boolean> visited = new HashMap<>();

        Queue<Node> Q = new LinkedList<>();
        Q.add(target);
        visited.put(target, true);
        // curr_level will keep track of how much radially we have moved
        int curr_level = 0;
        while(!Q.isEmpty()){
            int size = Q.size();
            if(curr_level == k) break;
            curr_level++;
            for(int i = 0; i<size; i++){
                // radial movement for each node in the queue
                Node  current = Q.remove();
                if(current.left!=null && !(visited.containsKey(current.left))){
                    Q.add(current.left);
                    visited.put(current.left, true);
                }
                if(current.right!=null && !(visited.containsKey(current.right))){
                    Q.add(current.right);
                    visited.put(current.right, true);
                }
                if(parent_track.containsKey(current) && !(visited.containsKey(parent_track.get(current)))){
                    Q.add(parent_track.get(current));
                    visited.put(parent_track.get(current), true);
                 }
            }
        }

        while(!Q.isEmpty()){
            ans.add(Q.remove().data);
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(3);

        root.left = new Node(5);
        root.right = new Node(1);

        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.right = new Node(8);
        root.right.left = new Node(0);

        root.left.right.right = new Node(4);
        root.left.right.left = new Node(7);

        Node target  = root.left;
        int k = 2;
        List<Integer> list = distanceK(root, target, k);
        System.out.println(list);

    }
}
