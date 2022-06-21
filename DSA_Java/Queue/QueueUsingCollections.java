import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollections {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.remove();
        q.remove();
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
