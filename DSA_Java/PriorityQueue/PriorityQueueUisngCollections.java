import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueUisngCollections {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // MinHeap by default
        pq.add(10);
        pq.add(0);
        pq.add(2);
        pq.add(15);
        pq.add(6);
        pq.add(9);
        System.out.println("Minheap Implementation");
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        System.out.println("MaxHeap Implementation");
        // MaxHeap Implementation
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(10);
        pq2.add(0);
        pq2.add(2);
        pq2.add(15);
        pq2.add(6);
        pq2.add(9);
        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(Collections.reverseOrder());
        pq3.add(10);
        pq3.add(0);
        pq3.add(2);
        pq3.add(15);
        pq3.add(6);
        pq3.add(9);
        System.out.println("Iterating through Priority Queue");
        Iterator itr = pq3.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
