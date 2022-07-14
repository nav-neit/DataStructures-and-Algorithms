import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class RightViewOfBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void rightviewlevelorder(Node root){
        if(root==null) return;
        Queue<Node> Q = new ArrayDeque<>();
        Q.add(root);
        Node node = null;
        ArrayList<Node> list  = new ArrayList<Node>();
        while(!Q.isEmpty()){
            int n = Q.size();
            for (int i = 0; i < n; i++) {
                node = Q.remove();
                if(node.left!=null) Q.add(node.left);
                if(node.right!=null) Q.add(node.right);
            }
            list.add(node);
        }
        for(Node n : list){
            System.out.print(n.data + " ");
        }
    }
    public static void reversepreorder(Node node, int level, ArrayList<Integer> list){
        if(node==null)
            return;
        if(level==list.size())
            list.add(node.data);
        reversepreorder(node.right, level +1, list);
        reversepreorder(node.left, level +1, list);
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        root.left.right.left = new Node(6);
        // iterative solution
        rightviewlevelorder(root);
        System.out.println();
        // recursive solution
        ArrayList<Integer> list = new ArrayList<>();
        reversepreorder(root, 0, list);
        System.out.println(list);

    }
}
