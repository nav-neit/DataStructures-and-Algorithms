public class BinaryTreeRepresentaition {
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
    public static void main(String[] args) {
        // level 0
        Node root = new Node(1);
        // level 1
        root.left = new Node(2);
        root.right = new Node(3);
        // level 2
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        // level 3
        root.right.left.right = new Node(7);
    }
}
