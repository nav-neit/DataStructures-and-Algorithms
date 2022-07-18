public class LCAinBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void lca(Node root, int v1, int v2){
        if(root==null){
            return;
        }
        while(root!=null){
            if(v1> root.data && v2> root.data){
                root = root.right;
            }else if( v1< root.data && v2< root.data){
                root = root.left;
            }else{
                System.out.println(root.data);
                break;
            }
        }
        return;
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(4);
        root.right = new Node(13);

        root.left.left = new Node(3);
        root.left.right = new Node(8);
        root.right.left = new Node(11);
        root.right.right  = new Node(15);

        root.left.left.left = new Node(1);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(9);

        root.left.left.left.right = new Node(2);
        root.left.right.left.left = new Node(5);
        root.left.right.left.right = new Node(7);

        lca(root, 5, 9);
        lca(root, 1, 2);
    }
}
