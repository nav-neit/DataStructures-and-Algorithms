public class DiameterOfBinaryTree {
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
    public static int diameterofBT(Node root){
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }
    public static int height(Node node, int[] diameter){
        if(node==null){
            return 0;
        }
        int lh = height(node.left, diameter);
        int rh = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh+rh+1);
        
        return 1 + Math.max(lh, rh);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        
        root.left = new Node(2);
        root.right = new Node(3);
        
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        
        root.right.left.left = new Node(5);
        root.right.right.right = new Node(7);
        
        root.right.left.left.left = new Node(9);
        root.right.right.right.right = new Node(8);

        int dia = diameterofBT(root);
        System.out.println(dia);
    }
}
