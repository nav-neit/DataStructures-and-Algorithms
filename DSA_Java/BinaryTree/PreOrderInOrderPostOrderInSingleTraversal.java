import java.util.Stack;

public class PreOrderInOrderPostOrderInSingleTraversal {
    static class Treenode{
        int data;
        Treenode left;
        Treenode right;
        Treenode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Pair{
        Treenode node;
        int state;
        Pair(Treenode node, int state){
            this.node = node;
            this.state = state;
        }
    }
    public static void preinposttraversal(Treenode root){
        if(root==null){
            return;
        }
        String preorder = "";
        String inorder = "";
        String postorder = "";
        Stack<Pair> st = new Stack<>();
        Pair rpr = new Pair(root, 1);
        st.push(rpr);
        while(!st.isEmpty()){
            Pair top = st.peek();
            if(top.state==1){
                preorder += top.node.data + " ";
                top.state++;
                if(top.node.left!=null) {
                    // go left and push the left node into the stack
                    st.push(new Pair(top.node.left, 1));
                }
            }else if(top.state==2){
                inorder += top.node.data + " ";
                top.state++;
               if(top.node.right!=null) {
                   // go right and push the right node into stack
                   st.push(new Pair(top.node.right, 1));
               }
            }else{
                postorder += top.node.data + " ";
                st.pop();
            }
        }
        System.out.println("Preorder : " + preorder);
        System.out.println("Inorder : " + inorder);
        System.out.println("Postorder : " + postorder);
    }
    public static void main(String[] args) {
        Treenode root = new Treenode(1);

        root.left = new Treenode(2);
        root.right = new Treenode(5);

        root.left.left = new Treenode(3);
        root.left.right = new Treenode(4);

        root.right.left  = new Treenode(6);
        root.right.right  = new Treenode(7);
        preinposttraversal(root);
    }
}
