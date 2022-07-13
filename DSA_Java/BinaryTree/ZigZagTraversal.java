import java.util.*;

public class ZigZagTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static ArrayList<Integer> zigzag1(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)
            return list;
        // Using Queue Data Structure
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        boolean lefttoright = true;
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Node node = q.remove();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                temp.add(node.data);
            }
            if(lefttoright){
                for (int i = 0; i < temp.size(); i++)
                    list.add(temp.get(i));
            }else{
                for (int i = temp.size()-1; i >=0; i--)
                    list.add(temp.get(i));
            }
           lefttoright = !(lefttoright);
        }
        return list;
    }
    public static void zigzag2(Node root){
        // Using Deque Data Structure
        Deque<Node> dq= new LinkedList<>();
        dq.add(root);
        Node node;
        boolean flag = true;
        while(!dq.isEmpty()){
            int n = dq.size();
            for (int i = 0; i < n; i++) {
                if(flag){
                    // left to right
                    node = dq.pollFirst();
                    System.out.print(node.data + " ");
                    if(node.left!=null)
                        dq.offerLast(node.left);
                    if(node.right!=null)
                        dq.offerLast(node.right);
                }else{
                    // right to left
                    node = dq.pollLast();
                    System.out.print(node.data + " ");
                    if(node.right!=null)
                        dq.offerFirst(node.right);
                    if(node.left!=null)
                        dq.offerFirst(node.left);

                }
            }
            flag = !(flag);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        root.left.left.left = new Node(7);
        root.left.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        System.out.println("Zigzag1" +'\n'+ zigzag1(root));
        System.out.println("Zigzag2");
        zigzag2(root);

    }
}
