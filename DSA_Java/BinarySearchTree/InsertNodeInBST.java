public class InsertNodeInBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data +  " ");
        inorder(root.right);
    }
    public static Node insertNode(Node node, int val){
        if(node ==null)
            return new Node(val);
        Node current  = node;
        while(true){
            if(current.data<val){
                if(current.right!=null){
                    current = current.right;
                }else{
                    current.right = new Node(val);
                    break;
                }
            }else{
                if(current.left!=null){
                    current = current.left;
                }else{
                    current.left = new Node(val);
                    break;
                }

            }
        }
        return node;
    }
    public static void main(String[] args) {
        Node root = new Node(6);

        root.left  = new Node(3);
        root.right = new Node(8);

        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(7);

        int val = 5;
        inorder(root);
        Node newroot = insertNode(root, val);
        System.out.println();
        inorder(newroot);
    }
}
