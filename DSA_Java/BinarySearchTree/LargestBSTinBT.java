public class LargestBSTinBT {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class NodeValue{
        public int maxNode, minNode, maxSize;
        NodeValue(int minNode, int maxNode, int maxSize){
            this.minNode = minNode;
            this.maxNode = maxNode;
            this.maxSize =  maxSize;
        }
    }
    public static NodeValue largestBSTsubtree(TreeNode root){
        // an empty tree is a BST of size 0
        if(root == null){
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        // get values of left and right subtree
        NodeValue left = largestBSTsubtree(root.left);
        NodeValue right = largestBSTsubtree(root.right);
        // if current node is greater than max in left and smaller than min in right then the subtree is a Binary search tee

        if(left.maxNode < root.data && right.minNode > root.data){
            // its a BST
            return new NodeValue(Math.min(root.data,left.minNode),
                                  Math.max(root.data, right.maxNode),
                                  left.maxSize + right.maxSize + 1);
        }
        // return [-inf, inf] so that parent can't be a valid BST
        return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));

    }
    public static int largestBSTsize(TreeNode root){
        return largestBSTsubtree(root).maxSize;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        System.out.println(largestBSTsize(root));
    }
}
