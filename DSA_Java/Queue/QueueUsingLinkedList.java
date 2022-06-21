public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    static class Queue{
        static Node front = null;
        static Node rear = null;

        public static boolean isEmpty(){
            return front==null &&  rear==null;
        }

        public static void enqueue(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                front = rear  = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
                return -1;
            }
            int val = front.data;
            if(front.next==null){
                rear = null;
            }
            front = front.next;
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
                return -1;
            }
            return front.data;
        }
    }
    public static void display(Queue q){
        Node temp = q.front;
        System.out.print("front->");
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("rear");
        System.out.println();
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        display(q);
        System.out.println(q.dequeue());
        display(q);
        System.out.println(q.dequeue());
        display(q);
        System.out.println(q.peek());
        display(q);
        q.enqueue(100);
        display(q);
        System.out.println(q.dequeue());
        display(q);
        System.out.println(q.dequeue());
        display(q);
        System.out.println(q.dequeue());
        display(q);
        System.out.println(q.dequeue());
        display(q);
        System.out.println(q.dequeue());
        display(q);
    }
}
