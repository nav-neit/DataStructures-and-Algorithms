import java.util.ArrayList;
import java.util.PriorityQueue;

public class MedianOfRunningStream {
    static class RunningStreamMedian{
        static ArrayList<Integer> arr = new ArrayList<>();
        public static void insert(int data){
            arr.add(data);
        }
        public static void findmedian(){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < arr.size(); i++) {
                pq.add(arr.get(i));
            }
            int ans = 0;
            int size = pq.size();
            if(size%2!=0){
                for (int i = 0; i < (size+1)/2; i++) {
                    ans = pq.poll();
                }
            }else{
                for (int i = 0; i < size/2; i++) {
                    ans = pq.poll();
                }
                ans = (ans + pq.poll())/2;
            }
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        RunningStreamMedian obj = new RunningStreamMedian();
        obj.insert(1);
        obj.insert(13);
        obj.findmedian();
        obj.insert(9);
        obj.insert(5);
        obj.findmedian();
        obj.insert(7);
        obj.insert(3);
        obj.findmedian();
        obj.insert(11);
        obj.findmedian();
    }
}
