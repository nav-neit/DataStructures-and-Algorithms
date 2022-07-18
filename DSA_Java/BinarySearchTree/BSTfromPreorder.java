public class BSTfromPreorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node bstfrompreorder(int[] pre){
        return bst(pre, Integer.MAX_VALUE, new int[1]);
    }
    public static Node bst(int[] pre, int ub, int[] i){
        if(i[0]==pre.length || pre[i[0]] > ub)
            return null;
        Node root = new Node(pre[i[0]]);
        i[0]++;
        root.left = bst(pre, root.data, i);
        root.right = bst(pre,ub,i);
        return root;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] preorder = {8, 5, 1, 7, 10, 12};
        Node root = bstfrompreorder(preorder);
        inorder(root);
    }
}
