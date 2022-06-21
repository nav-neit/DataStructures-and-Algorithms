import java.util.Arrays;

public class QueueUsingArray {
    static class arrQueue{
        static int [] arr;
        static int size;
        static int rear;
        arrQueue(int size){
            arr = new int[size];
            this.size = size;
            this.rear = -1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is Full");
                return;
            }else{
                rear++;
                arr[rear] = data;
            }
        }
        public static int remove(){
            if(rear==-1){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            arr[rear] = 0;
            rear--;
            return front;
        }
        public static int peek(){
            if(rear==-1){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            return front;
        }
     }
     public static void display(arrQueue q){
         System.out.println("Queue : " + Arrays.toString(q.arr));
     }
    public static void main(String[] args) {
        arrQueue q = new arrQueue(10);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
        System.out.println(q.peek());
        System.out.println(q.remove());
        display(q);
        System.out.println(q.remove());
        display(q);
        System.out.println(q.remove());
        display(q);
        System.out.println(q.remove());
        display(q);
        System.out.println(q.remove());
        display(q);
        System.out.println(q.remove());
        display(q);
    }
}
