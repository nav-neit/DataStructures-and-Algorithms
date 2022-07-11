public class RecursivePreOrderTraversal {
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
    public static void preOrderTraversal(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
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
        preOrderTraversal(root);
    }
}