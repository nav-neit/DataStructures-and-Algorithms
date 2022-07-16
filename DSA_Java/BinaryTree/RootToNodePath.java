import java.util.ArrayList;

public class RootToNodePath {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static boolean findpath(Node node, ArrayList<Integer> arr, int x){
        if(node==null) return false;

        arr.add(node.data);

        if(node.data==x) return true;

        boolean left = findpath(node.left, arr, x);
        if(left) {
            return true;
        }

        boolean right = findpath(node.right, arr, x);
        if(right){
            return true;
        }

        arr.remove(arr.size()-1);
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        ArrayList<Integer> arr = new ArrayList<>();
        int x = 7;
        findpath(root, arr, x);
        System.out.println(arr);
    }
}
