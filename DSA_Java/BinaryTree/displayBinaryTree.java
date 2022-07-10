import java.util.Stack;

public class displayBinaryTree {
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
    static class Pair{
        Node node;
        int state;
        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }
    public static void display(Node node){
        if(node == null){
            return;
        }

        String str = "";
        str += node.left==null?".":node.left.data + "";
        str += "<-" + node.data + "->";
        str += node.right==null?".":node.right.data + "";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Integer[] arr = {50 ,25 ,12 ,null ,null ,37 ,30 ,null ,null ,null ,75 ,62 ,null ,70 ,null ,null ,87 ,null ,null};
        Stack<Pair> st = new Stack<>();
        // Create root node
        Node root = new Node(arr[0]);
        // made a pair with root node and state
        Pair pr = new Pair(root,1);
        // push the root pair
        st.push(pr);

        int idx = 0;
        while(!st.isEmpty()){
            Pair top = st.peek();
            if(top.state == 1){
                idx++;
                if(arr[idx]!=null){
                    // create a node and link to left of current node
                    top.node.left= new Node(arr[idx]);
                    // make a left pair and push it into stack
                    st.push(new Pair(top.node.left, 1));
                }
                top.state++;
            }else if(top.state == 2){
                idx++;
                if(arr[idx]!=null){
                    // create a node and link to left of current node
                    top.node.right= new Node(arr[idx]);
                    // make a left pair and push it into stack
                    st.push(new Pair(top.node.right, 1));
                }
                top.state++;
            }else{
                st.pop();
            }
        }
        display(root);
    }
}
