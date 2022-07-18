public class InorderSuccessorAndPredecessorOfBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void inordersuccessor(Node root, int val){
        if(root == null)
            return;
        Node successor = null;
        while(root !=null){
            if(val >= root.data){
                root = root.right;
            }else{
                successor = root;
                root = root.left;
            }
        }
        if(successor!=null)
            System.out.println(successor.data);
        else
            System.out.println("No successor");
    }
    public static void inorderpredecessor(Node root, int val){
        if(root == null) return;
        Node predecessor = null;
        while(root!=null){
            if(root.data>=val){
                root = root.left;
            }else{
                predecessor = root;
                root = root.right;
            }
        }
        if(predecessor!=null){
            System.out.println(predecessor.data);
        }else{
            System.out.println("Predecessor not found");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        root.left.left.left = new Node(1);
        root.right.right.left = new Node(8);
        root.right.right.right = new Node(10);

        root.left.left.left.left = new Node(1);
        int val = 5;
        inordersuccessor(root, val);
        inorderpredecessor(root,val);
    }
}
