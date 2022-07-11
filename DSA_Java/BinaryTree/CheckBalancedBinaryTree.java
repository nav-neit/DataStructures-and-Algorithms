public class CheckBalancedBinaryTree {
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
    public static int height(Node node){
        if(node == null){
            return 0;
        }
        int lh = height(node.left);
        if(lh==-1) return -1;
        int rh = height(node.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return Math.max(lh, rh) + 1;
    }
    public static boolean checkbalanced(Node root){
        if(height(root)==-1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);

        root1.left = new Node(2);
        root1.right = new Node(3);

        root1.right.left = new Node(4);
        root1.right.right = new Node(5);
        System.out.println(checkbalanced(root1));

        Node root2 = new Node(1);

        root2.left = new Node(3);
        root2.right = new Node(2);

        root2.left.left = new Node(5);
        root2.left.right = new Node(4);

        root2.left.left.left = new Node(7);
        root2.left.left.right = new Node(6);
        System.out.println(checkbalanced(root2));
    }
}
