import java.util.Stack;

public class iterativePostOrderTraversalUsing1Stack {
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
        if(root == null){
            return;
        }
        Node curr = root;
        Stack<Node> st = new Stack<>();
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                // go to the extreme left
                st.push(curr);
                curr = curr.left;
            }else{
                // the current node dosen't have a left child
                // check if the node has a right child
                Node temp = st.peek().right;
                // if it dosen't have make curr that right cild
                if(temp!=null){
                    curr = temp;
                }else{
                    // its a leaf node and we are in its post order
                    temp = st.pop();
                    System.out.print(temp.data + " ");
                    // check if the popped child is a right node of its parent
                    // if yes then we are in the post order of the parent
                    while(!st.isEmpty() && temp == st.peek().right){
                        temp = st.pop();
                        System.out.print(temp.data + " ");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        root.left.right.left = new Node(6);
        root.right.right.right = new Node(8);
        postorder(root);
    }
}
