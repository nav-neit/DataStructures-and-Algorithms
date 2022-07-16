import java.util.ArrayDeque;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class Pair{
        Node node;
        int idx;
        Pair(Node node, int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    public static int maxwidth(Node root){
        Pair rtpr = new Pair(root,0);
        Queue<Pair> Q = new ArrayDeque<>();
        Q.add(rtpr);
        int ans = Integer.MIN_VALUE;
        while(!Q.isEmpty()){
            int n = Q.size();
            int minval = Q.peek().idx;
            int first = 0, last = 0;
            for (int i = 0; i < n; i++) {
                Node node = Q.peek().node;
                int index = Q.peek().idx-minval;
                Q.remove();
                if(i==0) first = index;
                if(i==n-1) last = index;
                if(node.left!=null)
                    Q.add(new Pair(node.left, 2*(index) + 1));
                if(node.right!=null)
                    Q.add(new Pair(node.right, 2*(index) + 2));
            }
            ans = Math.max(ans, last - first +1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(8);
        root.right.right = new Node(4);
        System.out.println(maxwidth(root));

        Node root1 = new Node(1);

        root1.left = new Node(2);
        root1.right = new Node(4);

        root1.left.left = new Node(5);
        System.out.println(maxwidth(root1));
    }
}
