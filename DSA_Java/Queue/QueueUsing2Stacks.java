import java.util.Stack;

public class QueueUsing2Stacks {
    static class Queue{
        static Stack<Integer> s1  = new Stack<>();
        static Stack<Integer> s2  = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void enqueue(int data){
            while(!s1.isEmpty()){
                int val = s1.pop();
                s2.push(val);
            }
            s1.push(data);
            while(!s2.isEmpty()){
                int val = s2.pop();
                s1.push(val);
            }
        }
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Underflow");
                return -1;
            }
            int val = s1.pop();
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Underflow");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
