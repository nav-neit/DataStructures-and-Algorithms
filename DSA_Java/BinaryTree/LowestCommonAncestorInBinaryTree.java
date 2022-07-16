public class LowestCommonAncestorInBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left  = this.right = null;
        }
    }

    public static Node postorder(Node node, int p, int q){
        if(node == null || node.data == p || node.data == q)
            return node;

        Node lnode = postorder(node.left, p, q);
        Node rnode = postorder(node.right, p, q);

        if(lnode == null && rnode == null){
            return null;
        }else if(lnode == null && rnode!=null){
            return rnode;
        }else if(lnode!=null && rnode==null){
            return lnode;
        }
        return node;
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left  = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(8);
        root.right.right = new Node(9);

        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);

        System.out.println(postorder(root, 2,7).data);
    }
}
