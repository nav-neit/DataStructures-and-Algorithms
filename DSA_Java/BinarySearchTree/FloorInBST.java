public class FloorInBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static int findfloor(Node node, int key){
        int floor = -1;
        while(node!=null){
            if(node.data == key){
                floor = node.data;
                return floor;
            }
            if(node.data>key){
                node = node.left;
            }else{
                floor = node.data;
                node = node.right;
            }
        }
        return floor;
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(2);
        root.left.right  = new Node(8);
        root.right.left = new Node(13);
        root.right.right = new Node(17);

        root.left.right.left = new Node(6);
        int key = 9;
        System.out.println(findfloor(root, key));
    }
}
