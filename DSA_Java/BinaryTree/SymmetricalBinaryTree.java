public class SymmetricalBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static boolean check(Node root){
        return root==null || checksymmetry(root.left, root.right);
    }
    public static boolean checksymmetry(Node left,Node right) {
        if(left==null || right== null)
            return left==right;
        if(left.data != right.data)
            return false;
        return checksymmetry(left.left, right.right) && checksymmetry(left.right, right.left);
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        System.out.println(check(root));

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(2);

        root1.left.right  = new Node(3);
        root1.right.right = new Node(3);
        System.out.println(check(root1));
    }
}
