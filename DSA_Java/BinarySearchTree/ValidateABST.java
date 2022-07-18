public class ValidateABST<a> {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static boolean isValidBST(Node root){
        return validateBST(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean validateBST(Node root, long min, long max){
        if(root == null)
            return true;
        // if cuurent node value lies outside the range
        if(root.data >= max || root.data<=min)
            return false;
        boolean lft = validateBST(root.left , min, root.data);
        boolean rgt = validateBST(root.right , root.data, max);
        return lft && rgt;
    }
    public static void main(String[] args) {
        Node root = new Node(13);

        root.left = new Node(10);
        root.right = new Node(15);

        root.left.left =  new Node(7);
        root.left.right = new Node(12);
        root.right.left = new Node(14);
        root.right.right = new Node(17);

        root.left.left.right = new Node(9);
        root.right.right.left = new Node(16);

        root.left.left.right.left = new Node(8);

        System.out.println(isValidBST(root));
    }
}
