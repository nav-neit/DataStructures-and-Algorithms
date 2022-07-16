public class ChildrenSumProperty {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void csp(Node node){
       if(node==null) return;

       int sum = 0;
       if(node.left!=null) sum += node.left.data;
       if(node.right!=null) sum += node.right.data;

       if(sum >= node.data) {
           node.data = sum;
       }else{
           if(node.left!=null) node.left.data = node.data;
           if(node.right!=null) node.right.data = node.data;
       }
       csp(node.left);
       csp(node.right);
       int tot = 0;
       if(node.left!=null) tot += node.left.data;
       if(node.right!=null) tot += node.right.data;
       if(node.left !=null || node.right !=null){
           node.data = tot;
       }
    }
    public static void preorder(Node node){
        if(node == null)  return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        Node root  = new Node(40);

        root.left = new Node(10);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.right = new Node(40);
        root.right.left = new Node(30);
        preorder(root);
        csp(root);
        System.out.println();
        preorder(root);
    }
}
