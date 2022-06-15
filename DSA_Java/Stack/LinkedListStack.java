import java.util.Scanner;

public class LinkedListStack {
    Node top;
    LinkedListStack(){
        this.top = null;
    }
    private class Node {
        private int val;
        private Node next;
        Node(int d) {
            this.val = d;
            this.next = null;
            }
    }
    public boolean isEmpty() {
        return top==null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public int peek() {
        if(!isEmpty()) {
            return top.val;
        }
        System.out.println("Stack is Empty");
        return -1;
    }
    public int pop(){
        if(!isEmpty()){
            int val  = top.val;
            top = top.next;
            return val;
        }
        System.out.println("Stack is empty");
        return -1;
    }
    public void disp(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        Node temp = top;
        System.out.print("head->");
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListStack st = new LinkedListStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.disp();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.disp();
        System.out.println(st.peek());
        st.disp();
        System.out.println(st.pop());
        st.disp();
        System.out.println(st.pop());
        st.disp();
        System.out.println(st.pop());
        st.disp();
        System.out.println(st.pop());
        st.disp();
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}
