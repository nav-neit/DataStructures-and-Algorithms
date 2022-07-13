public class MaximumPathSum {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.left = null;
        }
    }
    public static int maxPathSum(Node root){
        int[] maxi = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        maxPath(root, maxi);
        return maxi[0];
    }
    public static int maxPath(Node node, int[] maxi){
        if(node == null){
            return 0;
        }
        int leftsum = Math.max(0, maxPath(node.left, maxi));
        int rightsum = Math.max(0, maxPath(node.right, maxi));
        int tsm = leftsum + rightsum + node.data;
        maxi[0] = Math.max(maxi[0], tsm);
        return node.data + Math.max(leftsum, rightsum);
    }
    public static void main(String[] args) {
        Node root = new Node(-10);

        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(maxPathSum(root));
    }
}
