public class DeleteNodeInBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node deleteNode(Node root, int key){
       if(root==null)
           return null;
       if(root.data==key){

       }
       Node temp = root;

       while(root!=null){
           if(key < root.data){
                if(root.left!=null && root.left.data==key){
                    root.left = helper(root.left);
                    break;
                }else{
                    root = root.left;
                }
           }else{
                if(root.right!=null && root.right.data==key){
                    root.right = helper(root.right);
                    break;
                }else{
                    root = root.right;
                }
           }
       }
       return temp;
    }
    public static Node helper(Node root){
        if(root.left==null)
            return root.right;
        else if(root.right==null)
            return root.left;
        Node rightchild = root.right;
        Node lastright = findlastRight(root.left);
        lastright.right = rightchild;
        return root.left;
    }
    public static Node findlastRight(Node root){
        if(root.right==null)
            return root;
        return findlastRight(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(9);

        root.left = new Node(8);
        root.right = new Node(12);

        root.left.left = new Node(5);
        root.right.left = new Node(10);
        root.right.right = new Node(13);

        root.left.left.left = new Node(3);
        root.left.left.right = new Node(7);
        root.right.left.right = new Node(11);

        root.left.left.left.left = new Node(2);
        root.left.left.left.right = new Node(4);
        root.left.left.right.left = new Node(6);
        root.left.left.right.right = new Node(8);

        root.left.left.left.left.left = new Node(1);
        inorder(root);

        Node newNode = deleteNode(root, 5);
        System.out.println();
        inorder(newNode);
    }
}
