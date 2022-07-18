public class KthSmallestAndLargestElement {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void findKthsmallest(Node root, int[] kk){
        if(root==null)
            return;

        findKthsmallest(root.left, kk);
        kk[0] = kk[0] -1;
        if(kk[0] == 0)
        {
            System.out.println(root.data);
            return;
        }
        findKthsmallest(root.right, kk);
    }
    public static void findKthlargest(Node root, int[] kk){
        if(root == null)
            return;
        findKthlargest(root.right, kk);
        kk[0] = kk[0]  - 1;
        if(kk[0] == 0){
            System.out.println(root.data);
            return;
        }
        findKthlargest(root.left, kk);
    }
    public static void main(String[] args) {
        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        root.left.left.right = new Node(2);

        int k = 3;
        int[] kk = new int[1];
        kk[0] = k;
        findKthsmallest(root, kk);
        kk[0] = k;
        findKthlargest(root, kk);
    }
}
