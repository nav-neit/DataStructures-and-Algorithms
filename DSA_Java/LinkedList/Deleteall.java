import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Deleteall {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        list.add(34);
        list.add(20);
        list.add(80);
        list.add(60);
        list.add(25);
        list.add(60);
        list.add(70);
        System.out.println(list);
        int k = list.size();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if(list.get(i)>25) {
                arr.add(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            int idx = arr.get(i);
            list.remove(idx - i);
        }
        System.out.println(list);
    }
}
