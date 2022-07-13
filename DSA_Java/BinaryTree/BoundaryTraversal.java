import java.util.ArrayList;
import java.util.Stack;

public class BoundaryTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right =null;
        }
    }
    public static void inorder(Node node, ArrayList<Integer> arr){
        if(node==null) return;

        if(node.left==null && node.right==null) arr.add(node.data);
        inorder(node.left, arr);
        inorder(node.right, arr);
    }
    public static ArrayList<Integer> boundarytraversal(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.data);
        // get left boundary nodes
        Node node = root.left;
        while(true && node!=null){
            list.add(node.data);
            if(node.left!=null)
                node = node.left;
            else
                if(node.right!=null)
                    node = node.right;
            if(node.left==null && node.right==null) break;
        }
        // get leaf nodes
        inorder(root, list);

        // get right boundary nodes
        Stack<Integer> st = new Stack<>();
        node = root.right;
        while(true && node!=null){
            st.push(node.data);
            if(node.right!=null)
                node = node.right;
            else
                if(node.left!=null)
                    node = node.left;
            if(node.left==null && node.right==null) break;
        }
        while(!st.isEmpty())
            list.add(st.pop());

        return list;
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(7);

        root.left.left = new Node(3);
        root.right.right = new Node(8);

        root.left.left.right = new Node(4);
        root.right.right.left = new Node(9);

        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);
        System.out.println(boundarytraversal(root));
    }
}
