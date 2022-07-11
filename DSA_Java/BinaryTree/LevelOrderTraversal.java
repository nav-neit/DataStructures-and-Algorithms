import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }
    public static void levelorder1(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node node = q.peek();
            System.out.print(node.data + " ");
            if(node.left!=null) {
                q.add(node.left);
            }
            if(node.right!=null) {
                q.add(node.right);
            }
            q.remove();
        }
    }
    public static void levelorder2(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node node = q.remove();
                System.out.print(node.data + " ");
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
        }
    }
    public static void main(String[] args) {
        // level 0
        Node root = new Node(1);
        // level 1
        root.left = new Node(2);
        root.right = new Node(3);
        // level 2
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        // level 3
        root.left.right.left = new Node(6);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        levelorder1(root);
        System.out.println();
        levelorder2(root);
    }
}
