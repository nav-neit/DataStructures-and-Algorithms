import java.util.ArrayDeque;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class pair{
        Node node;
        int vertical;
        pair(Node node, int vertical){
            this.node = node;
            this.vertical = vertical;
        }
    }
    public static void topview(Node root){
        if(root==null)
            return;

        TreeMap<Integer, Node> map = new TreeMap<>();
        Queue<pair> Q = new ArrayDeque<>();
        pair rpr = new pair(root,0);
        Q.add(rpr);

        while(!Q.isEmpty()){
            pair pr = Q.remove();
            Node node = pr.node;
            int vertical = pr.vertical;

            if(map.containsKey(vertical)==false){
                map.put(vertical, node);
            }
            if(node.left!=null)
                Q.add(new pair(node.left, vertical-1));
            if(node.right!=null)
                Q.add(new pair(node.right, vertical+1));
        }

        for(int key : map.keySet()){
            System.out.print(map.get(key).data + " ");
        }
    }
    public static void main(String[] args) {
        Node root  = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        root.left.right.left = new Node(6);
        topview(root);
    }
}
