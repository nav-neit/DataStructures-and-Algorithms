
public class MaximumDepthOfBT {
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
    public static int height(Node node){
        // if there is no node then height is 0
        if(node==null){
            return 0;
        }

        // height of right subtree
        int lh = height(node.left);
        // height of left subtree
        int rh = height(node.right);
        // total height
        int th = 1 + Math.max(lh, rh);
        return th;
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

        int ht = height(root);
        System.out.println("Maximum depth/Height : " + ht);
    }
}
