import java.util.Stack;

public class iterativePostOrderTraversalUsing2Stacks {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if(root.left!=null) st1.push(root.left);
            if(root.right!=null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            System.out.print(st2.pop().data + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(11);
        root.right = new Node(16);

        root.left.left = new Node(2);
        root.left.right  = new Node(-1);
        root.right.left = new Node(10);
        root.right.left.left = new Node(9);
        root.right.left.right = new Node(11);

        postorder(root);

    }
}