
public class CeiLInBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static int findceil(Node node, int key){
        int ceil = -1;
        while(node!=null){
            if(node.data == key){
                ceil = node.data;
                return ceil;
            }
            if(node.data > key){
                ceil = node.data;
                node = node.left;
            }else{
                node = node.right;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(13);

        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.left = new Node(11);
        root.right.right = new Node(14);

        root.left.left.left = new Node(2);
        root.left.left.right = new Node(4);
        root.left.right.right = new Node(9);
        int key = 8;
        int ans = findceil(root, key);
        if(ans!=-1)
            System.out.println(ans);
        else
            System.out.println("no ceiling value");
    }
}
