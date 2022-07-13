import java.util.*;

public class VerticalOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class ncoords{
        Node node;
        int vertical;
        int level;
        ncoords(Node node, int vertical, int level){
            this.node = node;
            this.vertical = vertical;
            this.level = level;
        }
    }
    public static void verticalorder(Node root){
        if(root==null) return;
        // < vertical, < level, {elements}>>
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<ncoords> Q = new ArrayDeque<>();
        Q.add(new ncoords(root, 0, 0));
        while(!Q.isEmpty()){
            ncoords ncd = Q.remove();
            Node node = ncd.node;
            int vertical = ncd.vertical;
            int level = ncd.level;

            if(map.containsKey(vertical)==false)
                map.put(vertical, new TreeMap<>());
            if(map.get(vertical).containsKey(level)==false)
                map.get(vertical).put(level, new PriorityQueue<>());

            map.get(vertical).get(level).add(node.data);

            if(node.left!=null)
                Q.add(new ncoords(node.left, vertical - 1, level + 1));
            if(node.right!=null)
                Q.add(new ncoords(node.right, vertical +1 , level + 1));
        }

        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
        // iterate through every vertical
        for (TreeMap<Integer, PriorityQueue<Integer>> levelnodes: map.values()){
            list.add(new ArrayList<>());
            // iterate through all the elements in the same level in that vertical
            for(PriorityQueue<Integer> nodes: levelnodes.values()){
                while(!nodes.isEmpty()){
                    list.get(list.size()-1).add(nodes.poll());
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Node root  = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.right.left  = new Node(9);
        root.right.right = new Node(10);

        root.left.left.right = new Node(5);

        root.left.left.right.right = new Node(6);

        verticalorder(root);
    }
}
