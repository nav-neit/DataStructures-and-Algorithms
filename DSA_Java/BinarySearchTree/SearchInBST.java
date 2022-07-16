public class SearchInBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    // Recursive approach
    public static Node BSTsearch(Node node,int val){
        if(node==null)
            return null;
        if(node.data == val)
            return node;
        if(val > node.data)
            return BSTsearch(node.right, val);
        else
            return BSTsearch(node.left, val);
    }
    // Iterative approach
    public static Node search(Node node,int val){
        while(node!=null && node.data!=val){
            node = (val > node.data)? node.right : node.left;
        }
        return node;
    }
    public static void main(String[] args) {
        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(12);

        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.right.left = new Node(10);
        root.right.right = new Node(14);

        root.left.right.left = new Node(6);
        root.right.right.left = new Node(13);
        int k = 13;
        if(BSTsearch(root, k)!=null){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
        if(search(root, k)!=null){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
}
