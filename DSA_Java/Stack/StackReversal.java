import java.util.Stack;

public class StackReversal {
    public static void pushAtbottom(Stack<Integer> St, int k){
        if(St.isEmpty()){
            St.push(k);
            return;
        }
        int val = St.peek();
        St.pop();
        pushAtbottom(St,k);
        St.push(val);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtbottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        reverseStack(s);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
