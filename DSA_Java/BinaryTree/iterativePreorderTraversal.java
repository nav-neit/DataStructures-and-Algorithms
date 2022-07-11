import java.util.Stack;

public class iterativePreorderTraversal {
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
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node node = st.pop();
            System.out.print(node.data + " ");
            // Add right child
            if(node.right!=null)
                st.push(node.right);
            if(node.left!=null)
                st.push(node.left);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(7);

        root.left.left = new Node(3);
        root.left.right  = new Node(4);

        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);

        preorder(root);

    }
}
