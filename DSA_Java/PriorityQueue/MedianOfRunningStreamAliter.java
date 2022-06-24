import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfRunningStreamAliter {
    static class medianOfRunningStream{
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        public void insert(int num){
            if(maxheap.isEmpty()||maxheap.peek()>=num){
                maxheap.add(num);
            }else{
                minheap.add(num);
            }
            if(minheap.size()>maxheap.size()){
                maxheap.add(minheap.poll());
            }else if(maxheap.size()>minheap.size()+1){
                minheap.add(maxheap.poll());
            }
        }
        public void findmedain(){
          if(maxheap.size()==minheap.size()){
              System.out.println(maxheap.peek()/2.0 + minheap.peek()/2.0);
          }else{
              System.out.println(maxheap.peek());
          }

        }

    }
    public static void main(String[] args) {
        medianOfRunningStream obj = new medianOfRunningStream();
        obj.insert(1);
        obj.findmedain();
        obj.insert(13);
        obj.findmedain();
        obj.insert(7);
        obj.findmedain();
        obj.insert(10);
        obj.insert(11);
        obj.insert(5);
        obj.findmedain();
        obj.insert(3);
        obj.findmedain();
    }
}
