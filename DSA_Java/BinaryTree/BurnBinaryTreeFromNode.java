import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class BurnBinaryTreeFromNode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.left = this.right = null;
        }
    }

    public static void MarkParents(Node node, Map<Node, Node> parent_track)
    {
        Queue<Node> Q = new ArrayDeque<>();
        Q.add(node);
        while(!Q.isEmpty()){
            Node current  = Q.remove();
            if(current.left!=null){
                parent_track.put(current.left, current);
                Q.add(current.left);
            }
            if(current.right!=null){
                parent_track.put(current.right, current);
                Q.add(current.right);
            }
        }
    }
    public static int BurnBT(Node node, Node target){
        Queue<Node> Q = new ArrayDeque<>();
        Q.add(node);
        Map<Node, Boolean> visited = new HashMap<>();
        visited.put(target,true);
        int time = 0;

        Map<Node, Node> parent_track = new HashMap<>();
        MarkParents(node,parent_track);

        while(!Q.isEmpty()){
            int n = Q.size();
            boolean burned = false;

            for (int i = 0; i < n; i++) {
                Node current = Q.remove();
                if(current.left!=null && visited.get(current.left) == null){
                    burned = true;
                    visited.put(current.left, true);
                    Q.add(current.left);
                }
                if(current.right!=null && visited.get(current.right) == null){
                    burned = true;
                    visited.put(current.right, true);
                    Q.add(current.right);
                }
                if(parent_track.get(current) != null && visited.get(parent_track.get(current)) == null){
                    burned = true;
                    visited.put(parent_track.get(current), true);
                    Q.add(parent_track.get(current));
                }
            }
            if(burned) time++;
        }
        return time;
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        root.left.left.right = new Node(7);
        Node target = root.left;
        System.out.println(BurnBT(root,target));
    }
}
