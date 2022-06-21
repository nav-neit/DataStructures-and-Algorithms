import java.util.Arrays;

public class CircularQueueUsingArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;
        Queue(int size){
            arr = new int[size];
            this.size = size;
            this.rear = -1;
            this.front = -1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void enqueue(int data){
            if(isFull()){
                System.out.println("Queue OverFlow");
                return;
            }else if(isEmpty()){
                front++;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue underflow");
                return -1;
            }
            int val = arr[front];
            arr[front] = 0;
            // check for single element
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front + 1)%size;
            }
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue UnderFlow");
                return -1;
            }
            return arr[front];
        }
    }
    public static void display(Queue q){
        System.out.println(Arrays.toString(q.arr));
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        display(q);
        System.out.println(q.dequeue());;
        display(q);
        System.out.println(q.dequeue());
        display(q);
        System.out.println(q.peek());
        q.enqueue(100);
        display(q);
        q.enqueue(200);
        display(q);
        q.enqueue(300);
        System.out.println(q.dequeue());
        display(q);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        display(q);
        System.out.println(q.peek());
    }
}
