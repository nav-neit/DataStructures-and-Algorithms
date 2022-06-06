import java.util.*;
public class LLCollections {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("abc");
        list.addFirst("def");
        System.out.println(list);
        list.addLast("ghi");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
