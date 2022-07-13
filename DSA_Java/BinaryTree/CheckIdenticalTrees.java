public class CheckIdenticalTrees {
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
    public static boolean preorder(Node node1, Node node2)
    {
        if(node1==null || node2==null){
            return node1==node2;
        }
        return (node1.data == node2.data) && preorder(node1.left, node2.left) && preorder(node1.right, node2.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(10);

        root1.left = new Node(10);
        root1.right = new Node(20);

        root1.right.left = new Node(30);
        root1.right.right = new Node(40);

        root1.right.right.left = new Node(50);
        Node root2 = new Node(10);

        root2.left = new Node(10);
        root2.right = new Node(20);

        root2.right.left = new Node(30);
        root2.right.right = new Node(40);

        root2.right.right.left = new Node(50);
        System.out.println(preorder(root1, root2));

        Node root3 = new Node(10);

        root3.left = new Node(20);
        root3.right = new Node(30);

        System.out.println(preorder(root2, root3));
    }
}
