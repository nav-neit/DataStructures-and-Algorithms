import java.util.Stack;

public class PushAtBottomOfStack {
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
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        int k = 200;
        pushAtbottom(s, k);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
