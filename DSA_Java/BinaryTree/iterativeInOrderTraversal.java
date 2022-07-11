import java.util.Stack;

public class iterativeInOrderTraversal {
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
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        Stack<Node> st = new Stack<>();
        while(true){
            if(root!=null) {
                st.push(root);
                root = root.left;
            }else{
                if(st.isEmpty())
                    break;
                Node node = st.pop();
                System.out.print(node.data + " ");
                root = node.right;
            }
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

        inorder(root);

    }
}
